/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar audicao;

start: audicao
     ;

audicao: 'Audicão:' actuacao*
       ;

actuacao: 'Actuação' obra
                     maestro
                     musicos
        ;

obra: ':obra' ID_OBRA
    ;

maestro: ':maestro' ID_PROFESSOR
       ;

musicos: ':musicos' (ID_PROFESSOR | ID_ALUNO)*
       ;

ID_OBRA     : [Oo][0-9]*;
ID_PROFESSOR: [Pp][0-9]*;
ID_ALUNO    : [Aa][0-9]*;

PAL:    [a-zA-Z][-a-zA-Z_0-9]* ;

NUMERO: '0'..'9'+ ;

Sep: ('\r'? '\n' | ' ' | '\t')+  -> skip;
