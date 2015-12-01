
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "DELETE FROM Aluno WHERE id = '".$_REQUEST['id']."' ";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Aluno com id ".$_REQUEST['id']." removido com sucesso<br/>";
        print "<a href='gestaoAlunos.php'>Voltar</a>";
    }
      
?>