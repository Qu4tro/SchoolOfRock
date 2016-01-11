<?php

$oldId = $_REQUEST['id'];

$logs = simplexml_load_file("alunos.xml");
  
$alunos= $logs->xpath("//aluno[@id='".$oldId."']");
	
	foreach ($alunos as $aluno) {
		$aluno->nome = $_REQUEST['nome'];
		$aluno->dataNasc = $_REQUEST['data'];
		$aluno->curso= $_REQUEST['cursos'];
		$aluno->anoCurso = $_REQUEST['ano'];
		$aluno->instrumento = $_REQUEST['instrumentos'];
	}



header("Location:alunos.html");
$logs->asXML('alunos.xml');
?>