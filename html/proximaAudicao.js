var index;
var indice;


$(document).ready(function(){
	var proxima = moment(datas[0]);
	indice = 0;

	for(index=0;index<ids.length;index++){
			if((moment(datas[index]).isBefore(proxima)===true) && (moment(datas[index]).isAfter(moment())===true)){
				proxima = datas[index];
				indice = index;
			}
		}
		var div = document.getElementById('nextAuditionsBox');

	if(moment(proxima).isAfter(moment())){

		div.innerHTML = div.innerHTML + "<p>"+nomes[indice]+"</p><p>"+datas[indice]+"</p><br/><input type=\"button\" class=\"btn btn-default\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[indice]+"\'\" value=\"Consultar\"/>";
	}
	else{
		div.innerHTML = div.innerHTML + "<p>Não existem audições futuras.</p>";
	}
});