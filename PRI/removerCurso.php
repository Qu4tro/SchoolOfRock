
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "DELETE FROM Curso WHERE id = '".$_REQUEST['id']."' ";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Curso com id ".$_REQUEST['id']." removido com sucesso<br/>";
        print "<a href='gestaoCursos.php'>Voltar</a>";
    }
      
?>