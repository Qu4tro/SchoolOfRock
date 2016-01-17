<?php
	$id = $_REQUEST['idAudicao'];

	$logs = simplexml_load_file("audicoes.xml");

	$xslt = new XSLTProcessor();
	$XSL = new DOMDocument();
	$XSL->load('pdfAudicao.xsl',LIBXML_NOCDATA);
	$xslt->importStylesheet($XSL);

	$audicao = $logs->xpath("//audicao[@id='".$id."']");

	$audicaoPDF = fopen('audicao.pdf','w');
	fwrite($audicaoPDF,$xslt->transformToXML($audicao[0]));

	header('Content-Type: application/download');
    header('Content-Disposition: attachment; filename="audicao.pdf"');
    header("Content-Length: " . filesize("audicao.pdf"));
    $fp = fopen("audicao.pdf", "r");
    fpassthru($fp);
    fclose($fp);

	header("Location:audicoes.html");
?>