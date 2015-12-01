<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $qstring = "UPDATE Curso SET id='".$_REQUEST['id']."', designacao='".$_REQUEST['designacao']."', duracao='".$_REQUEST['duracao']."', instrumento='".$_REQUEST['instrumento']."' WHERE id='".$_REQUEST['oldId']."';";
    print $qstring."<br/>";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Curso com id ".$_REQUEST['id']." alterado com sucesso<br/>";
        print "<a href='gestaoCursos.php'>Voltar</a>";
    }
    
?>