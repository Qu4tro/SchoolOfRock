<?php
	$id = $_REQUEST['idAudicao'];

	$logs = simplexml_load_file("audicoes.xml");

	$xslt = new XSLTProcessor();
	$XSL = new DOMDocument();
	$XSL->load('paginaAudicao.xsl',LIBXML_NOCDATA);
	$xslt->importStylesheet($XSL);

	$audicao = $logs->xpath("//audicao[@id='".$id."']");

	$audicaoHTML = fopen('../audicao.html','w');
	fwrite($audicaoHTML,$xslt->transformToXML($audicao[0]));

	header('Content-Type: application/download');
    header('Content-Disposition: attachment; filename="audicao.html"');
    header("Content-Length: " . filesize("audicao.html"));
    $fp = fopen("audicao.html", "r");
    fpassthru($fp);
    fclose($fp);

	header("Location:audicoes.html");	
?>