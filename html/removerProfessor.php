<?php 

	$logs = new DOMDocument(); 
	$logs->load('professores.xml');

	$xslt = new XSLTProcessor();
	$XSL = new DOMDocument();
	$XSL->load('professores.xsl',LIBXML_NOCDATA);
	$xslt->importStylesheet($XSL);

	$professores = $logs->getElementsByTagName('professor');

	foreach ($professores as $professor) {
		$id = $professor->getAttribute("id");
		if($id == $_REQUEST['idProfessor']){
    		$professor->parentNode->removeChild($professor);}
		}

	$logs->save("professores.xml");
	

	$profsJS = fopen('listarProfessores.js','w');

	fwrite($profsJS,$xslt->transformToXML($logs)); 

	header("Location:professores.html");
?>