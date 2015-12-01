<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    $professores = simplexml_load_file('professores.xml');
    
    $nProfessores = 0;
    
    foreach($professores->professor as $p)
    {
        $qstring = "INSERT INTO Professor VALUES ('".(string)$p['id']."', '".(string)$p->nome."', '".(string)$p->dataNasc."','".(string)$p->habilitacoes."','".(string)$p->curso."');";
        $dbh->query($qstring);
        print $qstring."<br/>";
        
        $nProfessores++;
    }
    
    print "Carregados ".$nProfessores." professores na base de dados.<br/>";
    print "<a href='gestaoProfessores.php'>Voltar</a>";
    
?>