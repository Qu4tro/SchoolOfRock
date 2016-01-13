$("document").ready(function(){
	for(index=0;index<ids.length;index++){
        	$("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input class=\"btn btn-default btn-xs\" type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
    	}
})

function filtrar(){
	var sel = document.getElementById("filtrar").value;
	if(sel == "Todas"){
		todas();
    }
	if(sel == "Passadas"){
		passadas();
	} 	
	if(sel == "Futuras"){
		futuras();
	}
}

function todas(){
	index = 0;
	$("#audicoes tbody tr").remove();
    	for(index=0;index<ids.length;index++){
$("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input class=\"btn btn-default btn-xs\" type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
    	}
}

function passadas(){
	$("#audicoes tbody tr").remove();
		for(index=0;index<ids.length;index++){
			if(moment(datas[index]).isBefore()===true){
$("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input class=\"btn btn-default btn-xs\" type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
		}
	}
}

function futuras(){
	$("#audicoes tbody tr").remove();
		for(index=0;index<ids.length;index++){
			if(moment(datas[index]).isAfter()===true){
$("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input class=\"btn btn-default btn-xs\" type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
		}	
	}
}	




