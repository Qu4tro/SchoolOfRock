
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "SELECT * FROM Obra";
    $resultado = $dbh->query($qstring);
    
    print "<table border='1'>";
    print "<tr><th>Identificador</th><th>Nome</th><th>Ano Criação</th><th>Compositor</th><th>Operações</th></tr>";
    
    while($obra = $resultado->fetch())
    {
       print "<tr><td>".$obra['id']."</td><td>".$obra['nome']."</td><td>".$obra['anoCriacao']."</td><td>".$obra['compositor']."</td><td><a href=''><a href='alterarObra.php?id=".$obra['id']."'>[Alterar]</a><a href='removerObra.php?id=".$obra['id']."'> [Remover]</a></td></tr>";
    }
    
    print "</table>";
      
?>