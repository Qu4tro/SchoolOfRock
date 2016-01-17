<?php 

	$logs = new DOMDocument(); 
	$logs->load('alunos.xml');

	$xslt = new XSLTProcessor();
	$XSL = new DOMDocument();
	$XSL->load('alunos.xsl',LIBXML_NOCDATA);
	$xslt->importStylesheet($XSL);

	$alunos = $logs->getElementsByTagName('aluno');

	foreach ($alunos as $aluno) {
		$id = $aluno->getAttribute("id");
		if($id == $_REQUEST['idAluno']){
    		$aluno->parentNode->removeChild($aluno);}
		}

	$logs->save("alunos.xml");

	$alunosJS = fopen('../listarAlunos.js','w');

	fwrite($alunosJS,$xslt->transformToXML($logs));

	header("Location:alunos.html");
?>