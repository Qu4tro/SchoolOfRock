<?php
	$id = $_REQUEST['idAudicao'];

	$logs = simplexml_load_file("audicoes.xml");

	$xslt = new XSLTProcessor();
	$XSL = new DOMDocument();
	$XSL->load('pdfAudicao.xsl',LIBXML_NOCDATA);
	$xslt->importStylesheet($XSL);

	$audicao = $logs->xpath("//audicao[@id='".$id."']");

	$filename = "audicao".$id.".pdf";
	$audicaoPDF = fopen("audicao.pdf",'w');
	fwrite($audicaoPDF,$xslt->transformToXML($audicao[0]));

	header('Content-Type: application/download');
    header('Content-Disposition: attachment; filename="'.$filename.'"');
    header("Content-Length: " . filesize($filename));
    $fp = fopen($filename, "r");
    fpassthru($fp);
    fclose($fp);

	header("Location:audicoes.html");
?>