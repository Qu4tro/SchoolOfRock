
<?php 

    $dbh = new PDO('mysql:host=localhost;dbname=PRI','root');        
    $oldId = $_REQUEST['id'];
    $qstring = "SELECT * FROM Obra WHERE id='".$oldId."'";  
    $resultado = $dbh->query($qstring);
    
    $obra = $resultado->fetch(); 
    
    print "<form action='alterarObra2.php' method='post'>";
    print "<table>";
    print "<tr><td>Identificador</td><td><input type='text' value='".$obra['id']."' name='id'></td></tr>";
    print "<tr><td>Nome</td><td><input type='text' value='".$obra['nome']."' name='nome'></td></tr>";
    print "<tr><td>Descricao</td><td><input type='text' value='".$obra['descricao']."' name='descricao'></td></tr>";
    print "<tr><td>Ano de Criação</td><td><input type='text' value='".$obra['anoCriacao']."' name='anoCriacao'></td></tr>";
    print "<tr><td>Período</td><td><input type='text' value='".$obra['periodo']."' name='periodo'></td></tr>";
    print "<tr><td>Compositor</td><td><input type='text' value='".$obra['compositor']."' name='compositor'></td></tr>";
    print "</table>";
    print "<input type='hidden' value='".$oldId."' name='oldId'>";
    print "<input type='submit' value='Enviar'>";
    print "</form>";  
    
?>