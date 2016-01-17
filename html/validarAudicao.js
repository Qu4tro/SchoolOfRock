function validar(){
    var a=document.forms["adicionar"]["id"].value;
    var b=document.forms["adicionar"]["nome"].value;
    var c=document.forms["adicionar"]["data"].value;
    var d=document.forms["adicionar"]["local"].value;
    var e=document.forms["adicionar"]["inicio"].value;
    var f=document.forms["adicionar"]["duracao"].value;

    if (a==null || a=="",b==null || b=="",c==null || c=="", d==null || d=="", e==null || e=="", f==null || f=="")
      {
      alert("É necessário preencher todos os campos!");
      return false;
      }
    }