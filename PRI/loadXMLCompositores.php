
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    $compositores = simplexml_load_file('compositores.xml');
    
    $nCompositores = 0;
    
    foreach($compositores->compositor as $c)
    {
        $qstring = "INSERT INTO Compositor VALUES ('".(string)$c['id']."', '".(string)$c->nome."', '".(string)$c->bio."','".(string)$c->dataNasc."','".(string)$c->dataObito."','".(string)$c->periodo."');";
        $dbh->query($qstring);
        print $qstring."<br/>";
        
        $nCompositores++;
    }
    
    print "Carregados ".$nCompositores." compositores na base de dados.<br/>";
    print "<a href='gestaoCompositores.php'>Voltar</a>";
    
?>