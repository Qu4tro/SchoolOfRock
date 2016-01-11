var index=0;

$(document).ready(function(){
    for(index=0;index<ids.length;index++){
        $("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
    }
});
	


$("#filtro").live('change',function(){
	var select = document.getElementById("filtro");
	var selected = e.options[e.selectedIndex].text;

	if(selected == "Passados"){
		for(index=0;index<ids.length;index++){
			if(moment(datas[index]).isBefore(moment())){
				$("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
			}
		 }
	}
	if(selected == "Futuros"){
		for(index=0;index<ids.length;index++){
			if(moment(datas[index]).isAfter(moment())){
				$("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
			}
		 }
	}
});