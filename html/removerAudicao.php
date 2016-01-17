<?php 

	$logs = new DOMDocument(); 
	$logs->load('audicoes.xml');

	$xslt = new XSLTProcessor();
	$XSL = new DOMDocument();
	$XSL->load('audicoes.xsl',LIBXML_NOCDATA);
	$xslt->importStylesheet($XSL);

	$audicoes = $logs->getElementsByTagName('audicao');

	foreach ($audicoes as $audicao) {
		$id = $audicao->getAttribute("id");
		if($id == $_REQUEST['idAudicao']){
    		$audicao->parentNode->removeChild($audicao);}
		}

	$logs->save("audicoes.xml");

	$audicoesJS = fopen('listarAudicoes.js','w');
	fwrite($audicoesJS,$xslt->transformToXML($logs));

	header("Location:audicoes.html");
?>