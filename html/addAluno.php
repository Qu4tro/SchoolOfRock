<?php
	$logs = new DOMDocument(); 
	$logs->load('alunos.xml');
	 
	$log = $logs->createElement('aluno');
	$id = $logs->createAttribute('id');
	$id->value = $_GET['id'];
	$nome = $logs->createElement('nome',$_GET['nome']);
	$dataNasc = $logs->createElement('dataNasc',$_GET['dataNasc']);
	$curso = $logs->createElement('curso',$_GET['curso']);
	$anoCurso = $logs->createElement('anoCurso',$_GET['ano']);
	$instrumento = $logs->createElement('instrumento',$_GET['instrumentos']);
	 
	$log->appendChild($id);
	$log->appendChild($nome);
	$log->appendChild($dataNasc);
	$log->appendChild($curso);
	$log->appendChild($anoCurso);
	$log->appendChild($instrumento);
	 
	$logs->documentElement->appendChild($log);
	 
	$logs->save("alunos.xml");

	header("Location:alunos.html");
?>