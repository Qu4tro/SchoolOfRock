
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "DELETE FROM Compositor WHERE id = '".$_REQUEST['id']."' ";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Compositor com id ".$_REQUEST['id']." removido com sucesso<br/>";
        print "<a href='gestaoCompositores.php'>Voltar</a>";
    }
      
?>