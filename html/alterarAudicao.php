<?php

include('consultarAudicao.html');

$id = $_REQUEST['idAudicao'];

$logs = simplexml_load_file("audicoes.xml");
$logsAlunos = simplexml_load_file("alunos.xml");
$logsProfs = simplexml_load_file("professores.xml");
  
$audicao = $logs->xpath("//audicao[@id='".$id."']");

echo "<div class='newFormDiv'>";
echo "<form action='doAlterarAudicao.php' onsubmit='return validar()' class='newForm' name='adicionar'>";
echo "Id: <input type='text' name='id' value='".(string)$audicao[0]['id']."'size='3' readonly> <br/>";
echo "Nome: <input type='text' name='nome' value='".(string)$audicao[0]->nome."'size='45'> <br/>";
echo "Data: <input type='text' name='data'value='".(string)$audicao[0]->data."' size='6'> <br/>";
echo "Local: <input type='text' name='local' value='".(string)$audicao[0]->local."'size='15'><br/>"; 
echo "Início: <input type='text' name='inicio' value='".(string)$audicao[0]->inicio."'size='5'><br/>"; 
echo "Duração: <input type='text' name='duracao' value='".(string)$audicao[0]->duracao."'size='5'><br/>"; 



echo "<center><input type='submit' id='bigButton' onclick=\"validar()\" value='Alterar'> </center>";

?>