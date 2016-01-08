/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar planeadorAudicoes;

@header{
import java.io.IOException;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
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

public void createDocAlunos() throws ParserConfigurationException, SAXException, IOException{
     factoryA =DocumentBuilderFactory.newInstance();
     factoryA.setValidating(false);
     factoryA.setNamespaceAware(false);
     builderA = factoryA.newDocumentBuilder();
     docAlunos = (Document) builderA.parse("alunos.xml");
     
    }

public void createDocProfessores() throws ParserConfigurationException, SAXException, IOException{
     factoryP =DocumentBuilderFactory.newInstance();
     factoryP.setValidating(false);
     factoryP.setNamespaceAware(false);
     builderP = factoryP.newDocumentBuilder();
     docProfessores = (Document) builderP.parse("professores.xml");
    }
    
public void createDocObras() throws ParserConfigurationException, SAXException, IOException{
     factoryO =DocumentBuilderFactory.newInstance();
     factoryO.setValidating(false);
     factoryO.setNamespaceAware(false);
     builderO = factoryO.newDocumentBuilder();
     docObras = (Document) builderO.parse("obras.xml");
    }

public int findAluno(String id) throws XPathExpressionException{ 
     XPath xpath = XPathFactory.newInstance().newXPath();
     XPathExpression expr = xpath.compile("/Alunos/Aluno[@id="+id+"]");
     NodeList nodes = (NodeList) expr.evaluate(docAlunos, XPathConstants.NODESET);
     if(nodes==null) return 0;
     else return 1;
}

public int findProfessor(String id) throws XPathExpressionException{
     XPath xpath = XPathFactory.newInstance().newXPath();
     XPathExpression expr = xpath.compile("/Professores/Professor[@id="+id+"]");
     NodeList nodes = (NodeList) expr.evaluate(docProfessores, XPathConstants.NODESET);
     if(nodes==null) return 0;
     else return 1;
}

public int findObra(String id) throws XPathExpressionException{
    XPath xpath = XPathFactory.newInstance().newXPath();
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

aluno: IDA {try { if(findAluno($IDA.text)==0) throw new RuntimeException("O Aluno " + $IDA.text + " não existe na base de dados!");} catch(XPathExpressionException ex){}}; 

professores: professor (',' professor)*;

professor: IDP { try { if(findProfessor($IDP.text)==0) throw new RuntimeException("O Professor " + $IDP.text + " não existe na base de dados!"); } catch (XPathExpressionException ex) {}};

pecas: peca (',' peca)*;

peca: IDO { try { if(findObra($IDO.text)==0) throw new RuntimeException("A obra " + $IDO.text + " não existe na base de dados!"); } catch(XPathExpressionException ex){}};

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

