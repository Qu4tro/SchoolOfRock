var index=0;

$(document).ready(function(){
    for(index=0;index<cursos.length;index++){
        $("#cursos").append("<option>"+cursos[index]+"</option>");
    }
});