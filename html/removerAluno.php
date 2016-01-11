<?php 

	$logs = new DOMDocument(); 
	$logs->load('alunos.xml');

	$alunos = $logs->getElementsByTagName('aluno');

	foreach ($alunos as $aluno) {
		$id = $aluno->getAttribute("id");
		if($id == $_REQUEST['idAluno']){
    		$aluno->parentNode->removeChild($aluno);}
		}

	$logs->save("alunos.xml");
	header("Location:alunos.html");
?>