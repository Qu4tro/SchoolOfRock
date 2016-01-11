<?php

$oldId = $_REQUEST['id'];


$xsl = new DOMDocument;
$xsl->load('alunos.xsl',LIBXML_NOCDATA);

$logs = simplexml_load_file("alunos.xml");
  
$aluno= $logs->xpath("//aluno[@id='".$oldId."']");

$aluno[0]->nome = $_REQUEST['nome'];
$aluno[0]->dataNasc = $_REQUEST['data'];
$aluno[0]->curso= $_REQUEST['curso'];
$aluno[0]->anoCurso = $_REQUEST['ano'];

$proc = new XSLTProcessor;
$proc->importStyleSheet($xsl); 

$proc->transformToXML($logs);

include("alunos.html");

?>