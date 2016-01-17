<?php
	$logs = new DOMDocument(); 
	$logs->load('professores.xml');

	$xslt = new XSLTProcessor();
	$XSL = new DOMDocument();
	$XSL->load('professores.xsl',LIBXML_NOCDATA);
	$xslt->importStylesheet($XSL);
	 
	$log = $logs->createElement('professor');
	$id = $logs->createAttribute('id');
	$id->value = $_GET['id'];
	$nome = $logs->createElement('nome',$_GET['nome']);
	$dataNasc = $logs->createElement('dataNasc',$_GET['dataNasc']);
	$curso = $logs->createElement('curso',$_GET['cursos']);
	$habil = $logs->createElement('habilitacoes',$_GET['habil']);
	 
	$log->appendChild($id);
	$log->appendChild($nome);
	$log->appendChild($dataNasc);
	$log->appendChild($curso);
	$log->appendChild($habil);
	 
	$logs->documentElement->appendChild($log);
	 
	$logs->save("professores.xml");

	$profsJS = fopen('../listarProfessores.js','w');

	fwrite($profsJS,$xslt->transformToXML($logs));

	header("Location:professores.html");
?>