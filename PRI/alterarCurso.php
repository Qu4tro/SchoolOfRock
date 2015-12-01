
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $oldId = $_REQUEST['id'];
    $qstring = "SELECT * FROM Curso WHERE id='".$oldId."'";  
    $resultado = $dbh->query($qstring);
    
    $curso = $resultado->fetch(); 
    
    print "<form action='alterarCurso2.php' method='post'>";
    print "<table>";
    print "<tr><td>Identificador</td><td><input type='text' value='".$curso['id']."' name='id'></td></tr>";
    print "<tr><td>Designação</td><td><input type='text' value='".$curso['designacao']."' name='designacao'></td></tr>";
    print "<tr><td>Duração</td><td><input type='text' value='".$curso['duracao']."' name='duracao'></td></tr>";
    print "<tr><td>Instrumento</td><td><input type='text' value='".$curso['instrumento']."' name='instrumento'></td></tr>";
    print "</table>";
    print "<input type='hidden' value='".$oldId."' name='oldId'>";
    print "<input type='submit' value='Enviar'>";
    print "</form>";  
    
?>