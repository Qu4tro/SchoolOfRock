<?php

include('consultarAluno.html');

$id = $_REQUEST['idAluno'];

$logs = simplexml_load_file("alunos.xml");
  
$aluno = $logs->xpath("//aluno[@id='".$id."']");

echo "<div class='newFormDiv'>";
echo "<form action='doAlterarAluno.php' class='newForm'>";
echo "Id: <input type='text' name='id' value='".(string)$aluno[0]['id']."'size='3' readonly> <br/>";
echo "Nome: <input type='text' name='nome' value='".(string)$aluno[0]->nome."'size='45'> <br/>";
echo "Data de Nascimento: <input type='text' name='data'value='".(string)$aluno[0]->dataNasc."' size='6'> <br/>";
echo "Curso: <select name='cursos' id='cursos'><option selected='selected'>".(string)$aluno[0]->curso."</option></select><br/>";
echo "Ano do Curso: <input type='text' name='ano' value='".(string)$aluno[0]->anoCurso."'size='1'><br/>"; 
echo "Instrumento: <select name='instrumentos' id='instrumentos'><option selected='selected'>".(string)$aluno[0]->instrumento."</option></select><br/>";
echo "<center><input type='submit' id='bigButton' onclick=\"validar()\" value='Alterar'> </center>";
?>