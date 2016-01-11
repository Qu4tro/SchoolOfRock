var index=0;

$(document).ready(function(){
    for(index=0;index<instrumentos.length;index++){
        $("#instrumentos").append("<option>"+instrumentos[index]+"</option>");
    }
});