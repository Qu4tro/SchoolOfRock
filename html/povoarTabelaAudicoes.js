var index=0;

$(document).ready(function(){
    for(index=0;index<ids.length;index++){
        $("#audicoes").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+datas[index]+"</td><td>"+locais[index]+"</td><td><input type=\"button\" onclick=\"location.href=\'alterarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input type=\"button\" onclick=\"location.href=\'removerAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" onclick=\"location.href=\'consultarAudicao.php?idAudicao="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
    }
});