<?php

$oldId = $_REQUEST['id'];


/*$xsl = new DOMDocument;
$xsl->load('professores.xsl');*/

$logs = simplexml_load_file("professores.xml");
  
$professor= $logs->xpath("//professor[@id='".$oldId."']");

$professor[0]->nome = $_REQUEST['nome'];
$professor[0]->dataNasc = $_REQUEST['data'];
$professor[0]->curso= $_REQUEST['curso'];
$professor[0]->habilitacoes = $_REQUEST['habil'];

/*$proc = new XSLTProcessor;
$proc->importStyleSheet($xsl); 

$proc->transformToXML($logs);*/

include("professores.html");

?>