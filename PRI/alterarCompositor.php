
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $oldId = $_REQUEST['id'];
    $qstring = "SELECT * FROM Compositor WHERE id='".$oldId."'";  
    $resultado = $dbh->query($qstring);
    
    $compositor = $resultado->fetch(); 
    
    print "<form action='alterarCompositor2.php' method='post'>";
    print "<table>";
    print "<tr><td>Identificador</td><td><input type='text' value='".$compositor['id']."' name='id'></td></tr>";
    print "<tr><td>Nome</td><td><input type='text' value='".$compositor['nome']."' name='nome'></td></tr>";
    print "<tr><td>Biografia</td><td><input type='text' value='".$compositor['bio']."' name='bio'></td></tr>";
    print "<tr><td>Data de Nascimento</td><td><input type='text' value='".$compositor['dataNasc']."' name='dataNasc'></td></tr>";
    print "<tr><td>Data de Óbito</td><td><input type='text' value='".$compositor['dataObito']."' name='dataObito'></td></tr>";
    print "<tr><td>Período</td><td><input type='text' value='".$compositor['periodo']."' name='periodo'></td></tr>";
    print "</table>";
    print "<input type='hidden' value='".$oldId."' name='oldId'>";
    print "<input type='submit' value='Enviar'>";
    print "</form>";  
    
?>