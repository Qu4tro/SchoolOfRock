<?php

$oldId = $_REQUEST['id'];

$logs = simplexml_load_file("professores.xml");
  
$professores= $logs->xpath("//professor[@id='".$oldId."']");
	
	foreach ($professores as $professor) {
		$professor->nome = $_REQUEST['nome'];
		$professor->dataNasc = $_REQUEST['data'];
		$professor->curso= $_REQUEST['cursos'];
		$professor->habilitacoes = $_REQUEST['habil'];
	}



header("Location:professores.html");
$logs->asXML('professores.xml');
?>