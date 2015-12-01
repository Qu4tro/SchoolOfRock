
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    $cursos = simplexml_load_file('cursos.xml');
    
    $nCursos = 0;
    
    foreach($cursos->curso as $c)
    {
        $qstring = "INSERT INTO Curso VALUES ('".(string)$c['id']."', '".(string)$c->designacao."', '".(string)$c->duracao."','".(string)$c->instrumento."');";
        $dbh->query($qstring);
        print $qstring."<br/>";
        
        $nCursos++;
    }
    
    print "Carregados ".$nCursos." cursos na base de dados.<br/>";
    print "<a href='gestaoCursos.php'>Voltar</a>";
    
?>