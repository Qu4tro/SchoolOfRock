<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "SELECT * FROM Curso";
    $resultado = $dbh->query($qstring);
    
    print "<table border='1'>";
    print "<tr><th>Identificador</th><th>Designacao</th><th>Instrumento</th><th>Operações</th></tr>";
    
    while($curso = $resultado->fetch())
    {
       print "<tr><td>".$curso['id']."</td><td>".$curso['designacao']."</td><td>".$curso['instrumento']."</td><td><a href=''><a href='alterarCurso.php?id=".$curso['id']."'>[Alterar]</a><a href='removerCurso.php?id=".$curso['id']."'> [Remover]</a></td></tr>";
    }
    
    print "</table>";
      
?>