
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');    
    $alunos = simplexml_load_file('alunos.xml');
    
    $nAlunos = 0;
    
    foreach($alunos->aluno as $a)
    {
        $qstring = "INSERT INTO Aluno VALUES ('".(string)$a['id']."', '".(string)$a->nome."', '".(string)$a->dataNasc."','".(string)$a->curso."','".(string)$a->anoCurso."','".(string)$a->instrumento."');";
        $dbh->query($qstring);
        print $qstring."<br/>";
        
        $nAlunos++;
    }
    
    print "Carregados ".$nAlunos." alunos na base de dados.<br/>";
    print "<a href='gestaoAlunos.php'>Voltar</a>";
    
?>