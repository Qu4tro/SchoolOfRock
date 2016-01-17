$("document").ready(function(){
	for(index=0;index<ids.length;index++){
        	append();
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

function append(){
	$("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input class=\"btn btn-default btn-xs\" type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td><td><input type='button' class=\"btn btn-default btn-xs\" onclick=\"location.href=\'gerarPDF.php?idAudicao="+ids[index]+"\'\" value=\"Gerar PDF\"/></td><td><input type='button' class=\"btn btn-default btn-xs\" onclick=\"location.href=\'gerarHTML.php?idAudicao="+ids[index]+"\'\" value=\"Gerar HTML\"/></td></tr>");
}

function todas(){
	index = 0;
	$("#audicoes tbody tr").remove();
    	for(index=0;index<ids.length;index++){
    		append();
    	}
}

function passadas(){
	$("#audicoes tbody tr").remove();
		for(index=0;index<ids.length;index++){
			if(moment(datas[index]).isBefore()===true){
				append();
		}
	}
}

function futuras(){
	$("#audicoes tbody tr").remove();
		for(index=0;index<ids.length;index++){
			if(moment(datas[index]).isAfter()===true){
				append();
		}	
	}
}	




