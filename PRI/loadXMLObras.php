<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    $obras = simplexml_load_file('obras.xml');
    
    $nObras = 0;
    
    foreach($obras->obra as $o)
    {
        $qstring = "INSERT INTO Obra VALUES ('".(string)$o['id']."', '".(string)$o->nome."', '".(string)$o->desc."','".(string)$o->anoCriacao."','".(string)$o->periodo."','".(string)$o->compositor."');";
        $dbh->query($qstring);
        print $qstring."<br/>";
        
        $nObras++;
    }
    
    print "Carregadas ".$nObras." obras na base de dados.<br/>";
    print "<a href='gestaoObras.php'>Voltar</a>";
    
?>