var index=0;

$(document).ready(function(){
    for(index=0;index<nomes.length;index++){
        $("#professores").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+cursos[index]+"</td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'alterarProfessor.php?idProfessor="+ids[index]+"\'\" value=\"Alterar\"/></td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'removerProfessor.php?idProfessor="+ids[index]+"\'\" value=\"Remover\"/></td><td><input type=\"button\" class=\"btn btn-default btn-xs\" onclick=\"location.href=\'consultarProfessor.php?idProfessor="+ids[index]+"\'\" value=\"Consultar\"/></td></tr>");
    }
});