/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar planeadorAudicoes;

planeadorAudicoes: audicao;

audicao: 'Nome:' nome 'Local:' local plano;

plano: atuacao (';' atuacao)*;

atuacao: nome 'Alunos: ' alunos 'Professores:' professores 'Peças:' pecas;

alunos : aluno (',' aluno)*;

aluno: idA; 

professores: professor (',' professor)*;

professor: idP;

pecas: peca (',' peca)*;

peca: titulo;

idP : 'p' INT;
idA : 'a' INT;
titulo: STRING;
nome: STRING;
local:STRING;


/*--------------- Lexer ---------------------------------------*/

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*
    ;

DATA:   INT '-' INT '-' INT
    ;
INT :	'0'..'9'+
    ;

WS  :   [ \t\r\n]  -> skip
    ;
    
fragment
STRING
    :  '"' ( ESC_SEQ | ~('"') )* '"'
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') 
    ;

