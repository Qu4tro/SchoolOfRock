
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $oldId = $_REQUEST['id'];
    $qstring = "SELECT * FROM Professor WHERE id='".$oldId."'";  
    $resultado = $dbh->query($qstring);
    
    $professor = $resultado->fetch(); 
    
    print "<form action='alterarProfessor2.php' method='post'>";
    print "<table>";
    print "<tr><td>Identificador</td><td><input type='text' value='".$professor['id']."' name='id'></td></tr>";
    print "<tr><td>Nome</td><td><input type='text' value='".$professor['nome']."' name='nome'></td></tr>";
    print "<tr><td>Data de Nascimento</td><td><input type='text' value='".$professor['dataNasc']."' name='dataNasc'></td></tr>";
    print "<tr><td>Habilitações</td><td><input type='text' value='".$professor['habilitacoes']."' name='habilitacoes'></td></tr>";
    print "<tr><td>Curso</td><td><input type='text' value='".$professor['curso']."' name='curso'></td></tr>";
    print "</table>";
    print "<input type='hidden' value='".$oldId."' name='oldId'>";
    print "<input type='submit' value='Enviar'>";
    print "</form>";  
    
?>