/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar planeadorAudicoes;

@header{
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
}

@members{
DocumentBuilderFactory factoryA;
DocumentBuilder builderA;
Document docAlunos;
DocumentBuilderFactory factoryP;
DocumentBuilder builderP;
Document docProfessores;
DocumentBuilderFactory factoryO;
DocumentBuilder builderO;
Document docObras;

public void createDocAlunos(){
     factoryA =DocumentBuilderFactory.newInstance();
     factoryA.setValidating(false);
     factoryA.setNamespaceAware(false);
    try{
     builderA = factory.newDocumentBuilder();
     docAlunos = builder.parse("alunos.xml");
     }

public void createDocProfessores(){
     factoryP =DocumentBuilderFactory.newInstance();
     factoryP.setValidating(false);
     factoryP.setNamespaceAware(false);
    try{
     builderP = factoryP.newDocumentBuilder();
     docProfessores = builderP.parse("professores.xml");
     }
    
public void createDocObras(){
     factoryO =DocumentBuilderFactory.newInstance();
     factoryO.setValidating(false);
     factoryO.setNamespaceAware(false);
    try{
     builderO = factoryO.newDocumentBuilder();
     docObras = builderO.parse("obras.xml");
     }
    
public int findAluno(String id){
     XpathFactory xpathFactory = XPathFactory.newInstance();
     XPath xpath = xpathFactory.newXPath();
     XPathExpression expr = xpath.compile("/Alunos/Aluno[@id="+id+"]");
     NodeList nodes = (NodeList) expr.evaluate(docAlunos, XPathConstants.NODESET);
     if(nodes==null) return 0;
     else return 1;
}

public int findProfessor(String id){
     XpathFactory xpathFactory = XPathFactory.newInstance();
     XPath xpath = xpathFactory.newXPath();
     XPathExpression expr = xpath.compile("/Professores/Professor[@id="+id+"]");
     NodeList nodes = (NodeList) expr.evaluate(docProfessores, XPathConstants.NODESET);
     if(nodes==null) return 0;
     else return 1;
}

public int findObra(String id){
     XpathFactory xpathFactory = XPathFactory.newInstance();
     XPath xpath = xpathFactory.newXPath();
     XPathExpression expr = xpath.compile("/Obras/Obra[@id="+id+"]");
     NodeList nodes = (NodeList) expr.evaluate(docObras, XPathConstants.NODESET);
     if(nodes==null) return 0;
     else return 1;
}
}

planeadorAudicoes: audicao;

audicao: 'Audição' nome 'Local:' local 'Data:' data 'Início:' hora 'Duração:' duracao plano;

plano: atuacao (';' atuacao)*;

atuacao: nome 'Alunos:' alunos 'Professores:' professores 'Peças:' pecas 'Duração:' duracao;

alunos : aluno (',' aluno)*;

data: DATA;

duracao: hora;

hora returns [int horas, int minutos]: a=INT ':' b=INT {$horas = $a.int; $minutos= $b.int;}
        ;

aluno: IDA {if(findAluno($IDA.text)==0) throw new RuntimeException("O Aluno " + $IDA.text + " não existe na base de dados!");}; 

professores: professor (',' professor)*;

professor: IDP {if(findProfessor($IDP.text)==0) throw new RuntimeException("O Professor " + $IDP.text + " não existe na base de dados!");};

pecas: peca (',' peca)*;

peca: IDO {if(findObra($IDO.text)==0) throw new RuntimeException("A obra " + $IDO.text + " não existe na base de dados!");};

titulo: STRING;
nome:   STRING;
local:  STRING;


/*--------------- Lexer ---------------------------------------*/

IDA: 'a' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

IDP: 'p' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

IDO: 'o' ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*
    ;

DATA:   INT '-' INT '-' INT
    ;
INT :	'0'..'9'+
    ;

WS  :   [ \t\r\n]  -> skip
    ;
    
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

