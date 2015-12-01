
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "DELETE FROM Obra WHERE id = '".$_REQUEST['id']."' ";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Obra com id ".$_REQUEST['id']." removida com sucesso<br/>";
        print "<a href='gestaoObras.php'>Voltar</a>";
    }
      
?>