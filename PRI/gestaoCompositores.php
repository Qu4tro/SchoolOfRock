<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "SELECT * FROM Compositor";
    $resultado = $dbh->query($qstring);
    
    print "<table border='1'>";
    print "<tr><th>Identificador</th><th>Nome</th><th>Período</th><th>Operações</th></tr>";
    
    while($compositor = $resultado->fetch())
    {
       print "<tr><td>".$compositor['id']."</td><td>".$compositor['nome']."</td><td>".$compositor['periodo']."</td><td><a href=''><a href='alterarCompositor.php?id=".$compositor['id']."'>[Alterar]</a><a href='removerCompositor.php?id=".$compositor['id']."'> [Remover]</a></td></tr>";
    }
    
    print "</table>";
      
?>