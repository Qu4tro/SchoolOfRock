var index;
var indice;


$(document).ready(function(){
	var proxima = moment(datas[0]);
	indice = 0;

	for(index=0;index<ids.length;index++){
			if((moment(datas[index]).isBefore(proxima)===true) && (moment(datas[index]).isAfter(proxima)===true)){
				proxima = datas[index];
				indice = index;
			}
		}
	if(moment(proxima).isAfter(moment())){
		("#proximaAudicao").append("<tr><th>Nome:</th><td>"+nomes[indice]+"</td></tr><tr><th>Data:</th><td>"+datas[indice]+"</td></tr><tr><th>Local:</th><td>"+locais[indice]+"</td></tr>");
	}
	else{
		("#proximaAudicao").append("<tr><th>Não existem audições futuras.</th></tr>");
	}
});