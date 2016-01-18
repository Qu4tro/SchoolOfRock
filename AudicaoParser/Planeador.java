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

public class Planeador {

    Document docAlunos;
    Document docProfessores;
    Document docObras;
    Document docAudicoes;

    // Element rootAtuacoes;
    // Element rootAlunos;
    // Element rootProfessores;
    // Element rootObras;
    Element rootAudicoes;
    Element novaAudicao;

    Planeador(){

        try {
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





    public void createDocAlunos() throws ParserConfigurationException, SAXException, IOException{

        DocumentBuilderFactory factoryA;
        DocumentBuilder builderA;

        factoryA = DocumentBuilderFactory.newInstance();
        factoryA.setValidating(false);
        factoryA.setNamespaceAware(false);

        builderA = factoryA.newDocumentBuilder();

        this.docAlunos = (Document) builderA.parse("alunos.xml");
         
    }

    public void createDocAudicoes() throws ParserConfigurationException, SAXException, IOException {


        DocumentBuilderFactory factoryAud;
        DocumentBuilder builderAud;

        factoryAud =DocumentBuilderFactory.newInstance();
        factoryAud.setValidating(false);
        factoryAud.setNamespaceAware(false);
        builderAud = factoryAud.newDocumentBuilder();

        this.docAudicoes = (Document) builderAud.parse("audicoes.xml");

        // this.rootAudicoes = docAudicoes.getDocumentElement();
    }

    public void createDocProfessores() throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory factoryP;
        DocumentBuilder builderP;

        factoryP = DocumentBuilderFactory.newInstance();
        factoryP.setValidating(false);
        factoryP.setNamespaceAware(false);
        builderP = factoryP.newDocumentBuilder();

        this.docProfessores = (Document) builderP.parse("professores.xml");
    }
        
    public void createDocObras() throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory factoryO;
        DocumentBuilder builderO;

        factoryO = DocumentBuilderFactory.newInstance();
        factoryO.setValidating(false);
        factoryO.setNamespaceAware(false);
        builderO = factoryO.newDocumentBuilder();

        this.docObras = (Document) builderO.parse("obras.xml");
    }

    public boolean findAluno(String id) throws XPathExpressionException{ 
         XPath xpath = XPathFactory.newInstance().newXPath();
         XPathExpression expr = xpath.compile("/Alunos/Aluno[@id="+id+"]");
         NodeList nodes = (NodeList) expr.evaluate(docAlunos, XPathConstants.NODESET);

        return (nodes != null);
    }

    public boolean findProfessor(String id) throws XPathExpressionException{
         XPath xpath = XPathFactory.newInstance().newXPath();
         XPathExpression expr = xpath.compile("/Professores/Professor[@id="+id+"]");
         NodeList nodes = (NodeList) expr.evaluate(docProfessores, XPathConstants.NODESET);

        return (nodes != null);
    }

    public boolean findObra(String id) throws XPathExpressionException{
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile("/Obras/Obra[@id="+id+"]");
        NodeList nodes = (NodeList) expr.evaluate(docObras, XPathConstants.NODESET);

        return (nodes != null);
    }

    
}
