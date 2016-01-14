<?php 

	$logs = new DOMDocument(); 
	$logs->load('professores.xml');

	$professores = $logs->getElementsByTagName('professor');

	foreach ($professores as $professor) {
		$id = $professor->getAttribute("id");
		if($id == $_REQUEST['idProfessor']){
    		$professor->parentNode->removeChild($professor);}
		}

	$logs->save("professores.xml");
	header("Location:professores.html");

	$proc = new XSLTProcessor;
	$proc->importStyleSheet($xsl); 

	$proc->transformToXML($logs);
?>