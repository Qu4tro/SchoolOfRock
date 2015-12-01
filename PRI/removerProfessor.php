
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    
    $qstring = "DELETE FROM Professor WHERE id = '".$_REQUEST['id']."' ";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Professor com id ".$_REQUEST['id']." removido com sucesso<br/>";
        print "<a href='gestaoProfessores.php'>Voltar</a>";
    }
      
?>