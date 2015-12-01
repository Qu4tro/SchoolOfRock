
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "SELECT * FROM Aluno";
    $resultado = $dbh->query($qstring);
    
    print "<table border='1'>";
    print "<tr><th>Identificador</th><th>Nome</th><th>Instrumento</th><th>Operações</th></tr>";
    
    while($aluno = $resultado->fetch())
    {
       print "<tr><td>".$aluno['id']."</td><td>".$aluno['nome']."</td><td>".$aluno['instrumento']."</td><td><a href=''><a href='alterarAluno.php?id=".$aluno['id']."'>[Alterar]</a><a href='removerAluno.php?id=".$aluno['id']."'> [Remover]</a></td></tr>";
    }
    
    print "</table>";
      
?>