<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $qstring = "UPDATE Professor SET id='".$_REQUEST['id']."', nome='".$_REQUEST['nome']."', dataNasc='".$_REQUEST['dataNasc']."', habilitacoes='".$_REQUEST['habilitacoes']."', curso='".$_REQUEST['curso']."' WHERE id='".$_REQUEST['oldId']."';";
    print $qstring."<br/>";
    $resultado = $dbh->query($qstring);
    
    if($resultado) 
    {
        print "Professor com id ".$_REQUEST['id']." alterado com sucesso<br/>";
        print "<a href='gestaoProfessores.php'>Voltar</a>";
    }
    
?>