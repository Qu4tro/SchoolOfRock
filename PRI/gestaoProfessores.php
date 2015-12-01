
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "SELECT * FROM Professor";
    $resultado = $dbh->query($qstring);
    
    print "<table border='1'>";
    print "<tr><th>Identificador</th><th>Nome</th><th>Curso</th><th>Operações</th></tr>";
    
    while($professor = $resultado->fetch())
    {
       print "<tr><td>".$professor['id']."</td><td>".$professor['nome']."</td><td>".$professor['curso']."</td><td><a href=''><a href='alterarProfessor.php?id=".$professor['id']."'>[Alterar]</a><a href='removerProfessor.php?id=".$professor['id']."'> [Remover]</a></td></tr>";
    }
    
    print "</table>";
      
?>