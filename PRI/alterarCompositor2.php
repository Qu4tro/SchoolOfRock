<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $qstring = "UPDATE Compositor SET id='".$_REQUEST['id']."', nome='".$_REQUEST['nome']."', bio='".$_REQUEST['bio']."', dataNasc='".$_REQUEST['dataNasc']."', dataObito='".$_REQUEST['dataObito']."', periodo='".$_REQUEST['periodo']."' WHERE id='".$_REQUEST['oldId']."';";
    print $qstring."<br/>";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Compositor com id ".$_REQUEST['id']." alterado com sucesso<br/>";
        print "<a href='gestaoCompositores.php'>Voltar</a>";
    }
    
?>