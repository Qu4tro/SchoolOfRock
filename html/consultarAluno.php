<?php

include('consultarAluno.html');

$id = $_REQUEST['idAluno'];

$logs = simplexml_load_file("alunos.xml");
  
  $aluno = $logs->xpath("//aluno[@id='".$id."']");
 		echo" <center><table class='tableShow'>";
        echo "<tr><th>Nome:</th><th>".(string)$aluno[0]->nome."</th></tr>";
        echo "<th>Data de Nascimento:</th><th>".(string)$aluno[0]->dataNasc."</th></tr>";
        echo "<th>Curso:</th><th>".(string)$aluno[0]->curso."</th></tr>";
        echo "<th>Ano do Curso:</th><th>".(string)$aluno[0]->anoCurso."</th></tr>";
        echo "<th>Instrumento:</th><th>".(string)$aluno[0]->instrumento."</th></tr>";
 		echo "</table></center>";
?>