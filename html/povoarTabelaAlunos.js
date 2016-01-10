var index=0;

$(document).ready(function(){
    for(index=0;index<nomes.length;index++){
        $("#alunos").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+instrumentos[index]+"</td><td><input type=\"button\" onclick=\"location.href=\'alterarAluno.html\'\" value=\"Alterar\"/></td><td><input type=\"button\" onclick=\"location.href=\'removerAluno.html\'\" value=\"Remover\"/></td><td><input type=\"button\" onclick=\"location.href=\'consultarAluno.php?idAluno="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
    }
});