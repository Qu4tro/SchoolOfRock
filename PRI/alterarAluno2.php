
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $qstring = "UPDATE Aluno SET id='".$_REQUEST['id']."', nome='".$_REQUEST['nome']."', dataNasc='".$_REQUEST['dataNasc']."', curso='".$_REQUEST['curso']."', anoCurso='".$_REQUEST['anoCurso']."', instrumento='".$_REQUEST['instrumento']."' WHERE id='".$_REQUEST['oldId']."';";
    print $qstring."<br/>";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Aluno com id ".$_REQUEST['id']." alterado com sucesso<br/>";
        print "<a href='gestaoAlunos.php'>Voltar</a>";
    }
    
?>