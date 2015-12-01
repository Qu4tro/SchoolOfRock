<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $qstring = "UPDATE Obra SET id='".$_REQUEST['id']."', nome='".$_REQUEST['nome']."', descricao='".$_REQUEST['descricao']."', anoCriacao='".$_REQUEST['anoCriacao']."', periodo='".$_REQUEST['periodo']."', compositor='".$_REQUEST['compositor']."' WHERE id='".$_REQUEST['oldId']."';";
    print $qstring."<br/>";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Obra com id ".$_REQUEST['id']." alterada com sucesso<br/>";
        print "<a href='gestaoObras.php'>Voltar</a>";
    }
    
?>