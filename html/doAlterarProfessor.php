<?php

$oldId = $_REQUEST['id'];

$logs = simplexml_load_file("professores.xml");

$xslt = new XSLTProcessor();
$XSL = new DOMDocument();
$XSL->load('professores.xsl',LIBXML_NOCDATA);
$xslt->importStylesheet($XSL);
  
$professores= $logs->xpath("//professor[@id='".$oldId."']");
	
	foreach ($professores as $professor) {
		$professor->nome = $_REQUEST['nome'];
		$professor->dataNasc = $_REQUEST['data'];
		$professor->curso= $_REQUEST['cursos'];
		$professor->habilitacoes = $_REQUEST['habil'];
	}
$logs->asXML('professores.xml');

$profsJS = fopen('../listarProfessores.js','w');

fwrite($profsJS,$xslt->transformToXML($logs));

header("Location:professores.html");

?>