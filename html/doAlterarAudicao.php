<?php

$oldId = $_REQUEST['id'];

$logs = simplexml_load_file("audicoes.xml");


$xslt = new XSLTProcessor();
$XSL = new DOMDocument();
$XSL->load('audicoes.xsl',LIBXML_NOCDATA);
$xslt->importStylesheet($XSL);

$audicoes= $logs->xpath("//audicao[@id='".$oldId."']");
	
	foreach ($audicoes as $audicao) {
		$audicao->nome = $_REQUEST['nome'];
		$audicao->data = $_REQUEST['data'];
		$audicao->local= $_REQUEST['local'];
		$audicao->inicio = $_REQUEST['inicio'];
		$audicao->duracao = $_REQUEST['duracao'];
	}


$logs->asXML('audicoes.xml');

$audicoesJS = fopen('listarAudicoes.js','w');
fwrite($audicoesJS,$xslt->transformToXML($logs));

header("Location:audicoes.html");

?>