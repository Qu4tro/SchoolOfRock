<?php

include('consultarProfessor.html');

$id = $_REQUEST['idProfessor'];

$logs = simplexml_load_file("professores.xml");
  
  $professor = $logs->xpath("//professor[@id='".$id."']");
 		echo" <center><table class='tableShow'>";
        echo "<tr><th>Nome:</th><th>".(string)$professor[0]->nome."</th></tr>";
        echo "<th>Data de Nascimento:</th><th>".(string)$professor[0]->dataNasc."</th></tr>";
        echo "<th>Curso:</th><th>".(string)$professor[0]->curso."</th></tr>";
        echo "<th>Habilitações:</th><th>".(string)$professor[0]->habilitacoes."</th></tr>";
 		echo "</table></center>";
?>