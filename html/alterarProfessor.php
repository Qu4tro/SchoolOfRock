
<?php

include('consultarProfessor.html');

$id = $_REQUEST['idProfessor'];

$logs = simplexml_load_file("professores.xml");
  
$professor= $logs->xpath("//professor[@id='".$id."']");

echo "<div class='newFormDiv'>";
echo "<form action='doAlterarProfessor.php' class='newForm'>";
echo "Id: <input type='text' name='id' value='".(string)$professor[0]['id'	]."'size='3'> <br/>";
echo "Nome: <input type='text' name='nome' value='".(string)$professor[0]->nome."'size='45'> <br/>";
echo "Data de Nascimento: <input type='text' name='data' value='".(string)$professor[0]->dataNasc."' size='6'> <br/>";
echo "Curso: <input type='text' name='curso' value='".(string)$professor[0]->curso."'size='25'> <br/>";
echo "Habilitações: <input type='text' name='habil' value='".(string)$professor[0]->habilitacoes."'size='15'><br/>"; 
echo "<center><input type='submit' id='bigButton' value='Alterar'> </center>";
?>