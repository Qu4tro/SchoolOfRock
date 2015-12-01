
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $oldId = $_REQUEST['id'];
    $qstring = "SELECT * FROM Aluno WHERE id='".$oldId."'";  
    $resultado = $dbh->query($qstring);
    
    $aluno = $resultado->fetch(); 
    
    print "<form action='alterarAluno2.php' method='post'>";
    print "<table>";
    print "<tr><td>Identificador</td><td><input type='text' value='".$aluno['id']."' name='id'></td></tr>";
    print "<tr><td>Nome</td><td><input type='text' value='".$aluno['nome']."' name='nome'></td></tr>";
    print "<tr><td>Data de Nascimento</td><td><input type='text' value='".$aluno['dataNasc']."' name='dataNasc'></td></tr>";
    print "<tr><td>Curso</td><td><input type='text' value='".$aluno['curso']."' name='curso'></td></tr>";
    print "<tr><td>Ano</td><td><input type='text' value='".$aluno['ano']."' name='ano'></td></tr>";
    print "<tr><td>Instrumento</td><td><input type='text' value='".$aluno['instrumento']."' name='instrumento'></td></tr>";
    print "</table>";
    print "<input type='hidden' value='".$oldId."' name='oldId'>";
    print "<input type='submit' value='Enviar'>";
    print "</form>";  
    
?>