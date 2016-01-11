var index=0;

$(document).ready(function(){
    for(index=0;index<nomes.length;index++){
        $("#alunos").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+instrumentos[index]+"</td><td><input type=\"button\" onclick=\"location.href=\'alterarAluno.php?idAluno="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input type=\"button\" onclick=\"location.href=\'removerAluno.php?idAluno="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" onclick=\"location.href=\'consultarAluno.php?idAluno="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
    }
});