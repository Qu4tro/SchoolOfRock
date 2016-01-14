<?php 

	$logs = new DOMDocument(); 
	$logs->load('alunos.xml');

	$xsl = new DOMDocument;
	$xsl->load('alunos.xsl');

	$alunos = $logs->getElementsByTagName('aluno');

	foreach ($alunos as $aluno) {
		$id = $aluno->getAttribute("id");
		if($id == $_REQUEST['idAluno']){
    		$aluno->parentNode->removeChild($aluno);}
		}

	$logs->save("alunos.xml");
	header("Location:alunos.html");

	$proc = new XSLTProcessor;
	$proc->importStyleSheet($xsl); 

	$proc->transformToXML($logs);
?>