function validar(){
    var a=document.forms["adicionar"]["id"].value;
    var b=document.forms["adicionar"]["nome"].value;
    var c=document.forms["adicionar"]["dataNasc"].value;
    var d=document.forms["adicionar"]["habil"].value;

    if (a==null || a=="",b==null || b=="",c==null || c=="", d==null || d=="")
      {
      alert("É necessário preencher todos os campos!");
      return false;
      }
    }