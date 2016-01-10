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
import org.w3c.dom.Element;
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
DocumentBuilderFactory factoryAud;
DocumentBuilder builderAud;
Document docAudicoes;
Element rootAudicoes;
Element novaAudicao;
Element rootAtuacoes;
Element rootAlunos;
Element rootProfessores;
Element rootObras;


public void createDocAlunos() throws ParserConfigurationException, SAXException, IOException{
     factoryA =DocumentBuilderFactory.newInstance();
     factoryA.setValidating(false);
     factoryA.setNamespaceAware(false);
     builderA = factoryA.newDocumentBuilder();
     docAlunos = (Document) builderA.parse("alunos.xml");
     
    }

public void createDocAudicoes() throws ParserConfigurationException, SAXException, IOException{
     factoryAud =DocumentBuilderFactory.newInstance();
     factoryAud.setValidating(false);
     factoryAud.setNamespaceAware(false);
     builderAud = factoryA.newDocumentBuilder();
     docAudicoes = (Document) builderAud.parse("audicoes.xml");
     rootAudicoes = docAudicoes.getDocumentElement();
     novaAudicao = docAudicoes.createElement("audicao");
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

audicao: 'Audição' {try {
                createDocAlunos();
            } catch (ParserConfigurationException ex) {
            } catch (SAXException ex) {
            } catch (IOException ex) {
            }
                    try {
                createDocProfessores();
            } catch (ParserConfigurationException ex) {
            } catch (SAXException ex) {
            } catch (IOException ex) {
            }
                    try {
                createDocObras();
            } catch (ParserConfigurationException ex) {
            } catch (SAXException ex) {
            } catch (IOException ex) {
            }
                    try {
                createDocAudicoes();
            } catch (ParserConfigurationException ex) {
            } catch (SAXException ex) {
            } catch (IOException ex) {
            }
        } 
                    nome 'Local:' local 'Data:' data 'Início:' hora 'Duração:' duracao{
                          
                          Element nome = docAudicoes.createElement("nome");
                          nome.appendChild(docAudicoes.createTextNode($nome.val));
                          novaAudicao.appendChild(nome);
                           
                          Element local = docAudicoes.createElement("local");
                          local.appendChild(docAudicoes.createTextNode($local.val));
                          novaAudicao.appendChild(local);
                          
                          Element data = docAudicoes.createElement("data");
                          String dataString = Integer.toString($data.dia) + "/" + Integer.toString($data.mes) + "/" + Integer.toString($data.ano);
                          data.appendChild(docAudicoes.createTextNode(dataString));
                          novaAudicao.appendChild(data);
                          
                          Element inicio = docAudicoes.createElement("inicio");
                          String inicioString = Integer.toString($hora.horas) + ":" + Integer.toString($hora.minutos);
                          inicio.appendChild(docAudicoes.createTextNode(inicioString));
                          novaAudicao.appendChild(inicio);
                          
                          Element duracao = docAudicoes.createElement("duracao");
                          String duracaoString = Integer.toString($duracao.horas) + ":" + Integer.toString($duracao.minutos);
                          duracao.appendChild(docAudicoes.createTextNode(duracaoString));
                          novaAudicao.appendChild(duracao);
                         }
                    plano{
                          rootAtuacoes = docAudicoes.createElement("atuacoes");
                          };

plano: atuacao (';' atuacao)*;

atuacao: nome {
               Element nome = docAudicoes.createElement("nome");
               nome.appendChild(docAudicoes.createTextNode($nome.val));
               rootAtuacoes.append(nome);
               }
         'Alunos:' alunos {
                           rootAlunos = docAudicoes.createElement("alunos");
                           }
         'Professores:' professores {
                           rootProfessores = docAudicoes.createElement("professores");
                           }
         'Peças:' pecas {
                           rootObras = docAudicoes.createElement("obras");
                           }
         'Duração:' duracao{
                            Element duracao = docAudicoes.createElement("duracao");
                            String duracaoString = Integer.toString($duracao.horas) + ":" + Integer.toString($duracao.minutos);
                            duracao.appendChild(docAudicoes.createTextNode(duracaoString));
                            rootAtuacoes.append(duracao);
                            };

alunos : aluno (',' aluno)*;

data returns [int dia, int mes, int ano]: a=NT '-' b=INT '-' c=INT {$dia = $a.int; $mes = $b.int; $ano = $c.int;};

duracao returns [int horas, int minutos] : hora {$horas = $hora.horas; $minutos= $hora.minutos;};

hora returns [int horas, int minutos]: a=INT ':' b=INT {$horas = $a.int; $minutos= $b.int;}
        ;

aluno: IDA { try { 
                  if(findAluno($IDA.text)==0) 
                    throw new RuntimeException("O Aluno " + $IDA.text + " não existe na base de dados!");}
             catch(XPathExpressionException ex){}}; 

professores: professor (',' professor)*;

professor: IDP { try { 
                      if(findProfessor($IDP.text)==0) 
                        throw new RuntimeException("O Professor " + $IDP.text + " não existe na base de dados!"); } 
                catch (XPathExpressionException ex) {}};

pecas: peca (',' peca)*;

peca: IDO { try { 
                 if(findObra($IDO.text)==0) 
                    throw new RuntimeException("A obra " + $IDO.text + " não existe na base de dados!"); } 
           catch(XPathExpressionException ex){}};

titulo returns [String val] : STRING {$val = $STRING.text;};
nome returns [String val] :   STRING {$val = $STRING.text;};
local returns [String val] :  STRING {$val = $STRING.text;};


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

