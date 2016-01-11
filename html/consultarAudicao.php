<?php

include('consultarAudicao.html');

$id = $_REQUEST['idAudicao'];

$logs = simplexml_load_file("audicoes.xml");

//metadados
  $audicao = $logs->xpath("//audicao[@id='".$id."']");
 		echo "<center><table class='tableShow'>";
        echo "<tr><th>Nome:</th><td>".(string)$audicao[0]->nome."</td></tr>";
        echo "<tr><th>Local:</th><td>".(string)$audicao[0]->local."</td></tr>";
        echo "<tr><th>Data:</th><td>".(string)$audicao[0]->data."</td></tr>";
        echo "<tr><th>Início:</th><td>".(string)$audicao[0]->inicio."</td></tr>";
        echo "<tr><th>Duração:</th><td>".(string)$audicao[0]->duracao."</td></tr>";
 		echo "</table></center>";

//atuações
 $atuacoes = $logs->xpath("//audicao[@id='".$id."']/atuacoes/atuacao");
 		foreach ($atuacoes as $atuacao) {
 			echo("<center><table class='tableShow'>");
 			echo("<tr><th>Nome:</th><td>".(string)$atuacao->nome."</td></tr>");
 			echo("<tr><th>Duracao:</th><td>".(string)$atuacao->duracao."</td></tr>");
 			echo("<tr><th>Alunos:</th><td></td></tr>");
 				foreach ($atuacao->alunos->aluno as $aluno) {
 					echo("<tr><td></td><td>".(string)$aluno."</td></tr>");}
			echo("<tr><th>Professores:</th><td></td></tr>");
				foreach ($atuacao->professores->professor as $professor) {
 					echo("<tr><td></td><td>".(string)$professor."</td></tr>");}
			echo "</table></center>";
 		}

 		echo "<center><input type='button' id='bigButton' onclick=\"location.href='audicoes.html'\" value=\"Voltar\"/></center>";
?>