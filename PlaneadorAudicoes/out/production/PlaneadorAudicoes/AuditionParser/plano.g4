grammar plano;

@members{
    DataInterface dataInterface = new DataInterface();
    Audicao audition  = new Audicao();
}


audicao: 'Audição'  nome           {audition.setNome($nome.text);}
         'Local:'   local          {audition.setLocal($local.text);}
         'Data:'    data           {audition.setData($data.day, $data.month, $data.year);}
         'Início:'  hora           {audition.setInicio($hora.hours, $hora.minutes);}
         'Duração:' hora           {audition.setDuracao($hora.hours, $hora.minutes);}
         plano
                                   {dataInterface.addAudicao(audition);}
       ;

plano:       a1=atuacao            {audition.addAtuacao($a1.a);}
        (';' a2=atuacao            {audition.addAtuacao($a2.a);})*
     ;

atuacao returns [Atuacao a]:
    nome                           {$a = new Atuacao(dataInterface, $nome.text);}
    'Alunos:' aluno[$a]*
    'Professores:' professor[$a]*
    'Peças:' peca[$a]*
    'Duração:' hora                {$a.setDuracao($hora.hours, $hora.minutes);}
    ;



aluno [Atuacao a]:
    IDA                            { a.addAluno($IDA.text); }
    ;


professor [Atuacao a]:
    IDP                            { a.addProfessor($IDP.text); }
    ;

peca [Atuacao a]:
    IDO                            { a.addPeca($IDO.text); }
    ;

nome:   STRING;
local:  STRING;


data returns [int day, int month, int year]:
    d=INT '-' m=INT '-' y=INT      { $day = $d.int;
                                     $month = $m.int;
                                     $year = $y.int;}
    ;


hora returns [int hours, int minutes]:
    h=INT ':' m=INT              { $hours = $h.int;
                                   $minutes = $m.int;}
    ;



/*--------------- Lexer ---------------------------------------*/

IDA: 'a' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

IDP: 'p' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

IDO: 'o' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*
    ;


INT :	'0'..'9'+
    ;

WS  :   [ \t\r\n]  -> skip
    ;

STRING
    :  '"' (~('"') )* '"'
    ;

