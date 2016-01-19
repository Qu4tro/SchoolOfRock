package AuditionParser;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileInputStream;
import java.io.File;


public class DataInterface {

    Document docAlunos;
    Document docProfessores;
    Document docObras;
    Document docAudicoes;


    FileInputStream audicoesFile;
    FileInputStream alunosFile;
    FileInputStream professoresFile;

    public DataInterface(){

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
        this.alunosFile = new FileInputStream(new File("C:\\Users\\patri\\Documents\\GitHub\\SchoolOfRock\\PlaneadorAudicoes\\src\\AuditionParser\\alunos.xml"));

        factoryA = DocumentBuilderFactory.newInstance();
        factoryA.setValidating(false);
        factoryA.setNamespaceAware(false);

        builderA = factoryA.newDocumentBuilder();

        this.docAlunos = builderA.parse(this.alunosFile);

    }

    public void createDocAudicoes() throws ParserConfigurationException, SAXException, IOException {


        DocumentBuilderFactory factoryAud;
        DocumentBuilder builderAud;

        factoryAud = DocumentBuilderFactory.newInstance();
        factoryAud.setValidating(false);
        factoryAud.setNamespaceAware(false);
        builderAud = factoryAud.newDocumentBuilder();

        this.audicoesFile = new FileInputStream(new File("C:\\Users\\patri\\Documents\\GitHub\\SchoolOfRock\\PlaneadorAudicoes\\src\\AuditionParser\\audicoes.xml"));

        this.docAudicoes = builderAud.parse(this.audicoesFile);
    }

    public void addAudicao(Audicao audicao){
        Element dataTag = docAudicoes.getDocumentElement();
        dataTag.appendChild(createAudicaoXML(docAudicoes, audicao));
        saveAudicoes();
    }

    public void saveAudicoes() {

        Transformer transformer;

        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            StreamResult output = new StreamResult(new File("output.xml"));
            DOMSource input = new DOMSource(docAudicoes);

            transformer.transform(input, output);

        } catch (TransformerException exception){
            //Todo: unknown error
        }
    }

    public void createDocProfessores() throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory factoryP;
        DocumentBuilder builderP;

        factoryP = DocumentBuilderFactory.newInstance();
        factoryP.setValidating(false);
        factoryP.setNamespaceAware(false);
        builderP = factoryP.newDocumentBuilder();

        this.professoresFile = new FileInputStream(new File("C:\\Users\\patri\\Documents\\GitHub\\SchoolOfRock\\PlaneadorAudicoes\\src\\AuditionParser\\alunos.xml"));

        this.docProfessores = (Document) builderP.parse(this.professoresFile);
    }

    public void createDocObras() throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory factoryO;
        DocumentBuilder builderO;

        factoryO = DocumentBuilderFactory.newInstance();
        factoryO.setValidating(false);
        factoryO.setNamespaceAware(false);
        builderO = factoryO.newDocumentBuilder();

        this.docObras = (Document) builderO.parse("C:\\Users\\patri\\Documents\\GitHub\\SchoolOfRock\\PlaneadorAudicoes\\src\\AuditionParser\\obras.xml");
    }

    public boolean existeAluno(String id) throws XPathExpressionException{
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile("/Alunos/Aluno[@id="+id+"]");
        NodeList nodes = (NodeList) expr.evaluate(docAlunos, XPathConstants.NODESET);

        return (nodes != null);
    }

    public boolean existeProfessor(String id) throws XPathExpressionException{
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile("/Professores/Professor[@id="+id+"]");
        NodeList nodes = (NodeList) expr.evaluate(docProfessores, XPathConstants.NODESET);

        return (nodes != null);
    }

    public boolean existeObra(String id) throws XPathExpressionException{
        XPath xpath = XPathFactory.newInstance().newXPath();
        XPathExpression expr = xpath.compile("/Obras/Obra[@id="+id+"]");
        NodeList nodes = (NodeList) expr.evaluate(docObras, XPathConstants.NODESET);

        return (nodes != null);
    }



    private Element createAudicaoXML(Document doc, Audicao a){
        Element aud = doc.createElement("audicao");
        aud.setAttribute("id",a.getId());

        Element nome = doc.createElement("nome");
        nome.setTextContent(a.getNome());

        Element data = doc.createElement("data");
        data.setTextContent(a.getData());

        Element local = doc.createElement("local");
        local.setTextContent(a.getLocal());

        Element inicio = doc.createElement("inicio");
        inicio.setTextContent(a.getInicio());

        Element duracao = doc.createElement("duracao");
        duracao.setTextContent(a.getDuracao() + " min");

        aud.appendChild(nome);
        aud.appendChild(data);
        aud.appendChild(local);
        aud.appendChild(inicio);
        aud.appendChild(duracao);
        aud.appendChild(createAtuacaoXML(doc, a.getAtuacoes()));

        return aud;
    }

    private Element createAtuacaoXML(Document doc, ArrayList<Atuacao> atuacoes){

        Element at;
        Element nome;
        Element duracao;
        Element alunos;
        Element aluno;
        Element professores;
        Element professor;
        Element obras;
        Element obra;

        Element ats = doc.createElement("atuacoes");

        for (Atuacao a : atuacoes) {
            at = doc.createElement("atuacao");

            nome = doc.createElement("nome");
            nome.setTextContent(a.getNome());
            at.appendChild(nome);

            duracao = doc.createElement("duracao");
            duracao.setTextContent(a.getDuracao() + " min");
            at.appendChild(duracao);

            alunos = doc.createElement("alunos");
            for (String id: a.getAlunos()){
                aluno = doc.createElement("aluno");
                aluno.setTextContent(id);

                alunos.appendChild(aluno);
            }
            at.appendChild(alunos);

            professores = doc.createElement("professores");
            for (String id: a.getProfessores()){
                professor = doc.createElement("professor");
                professor.setTextContent(id);

                professores.appendChild(professor);
            }
            at.appendChild(professores);

            obras = doc.createElement("obras");
            for (String id: a.getPecas()){
                obra = doc.createElement("obra");
                obra.setTextContent(id);

                obras.appendChild(obra);
            }
            at.appendChild(obras);

            ats.appendChild(at);
        }

        return ats;
    }



}
