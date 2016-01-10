var index=0;

$(document).ready(function(){
    for(index=0;index<nomes.length;index++){
        $("#professores").append("<tr><td>"+ids[index]+"</td><td>"+nomes[index]+"</td><td>"+cursos[index]+"</td><td><input type='button' onclick='location.href='alterarProfessor.html';' value='Alterar'/></td><td><input type='button' onclick='location.href='removerProfessor.html';' value='Remover'/></td><td><input type='button' onclick='location.href='consultarProfessor.html';' value='Consultar'/></td></tr>");
    }
});