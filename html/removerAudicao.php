<?php 

	$logs = new DOMDocument(); 
	$logs->load('audicoes.xml');

	$audicoes = $logs->getElementsByTagName('audicao');

	foreach ($audicoes as $audicao) {
		$id = $audicao->getAttribute("id");
		if($id == $_REQUEST['idAudicao']){
    		$audicao->parentNode->removeChild($audicao);}
		}

	$logs->save("audicoes.xml");
	header("Location:audicoes.html");
?>