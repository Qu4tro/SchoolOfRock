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

public class Audicao {

    String nome;
    String local;
    int dia;
    int mes;
    int ano;
    int horaInicio;
    int minutosInicio;
    int duracaoHoras;
    int duracaoMinutos;

    public Audicao(String nome, String local, int dia, int mes, int ano, int horaInicio, int minutosInicio, int duracaoHoras, int duracaoMinutos){
        this.nome = nome;
        this.local = local;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.horaInicio = horaInicio;
        this.minutosInicio = minutosInicio;
        this.duracaoHoras = duracaoHoras;
        this.duracaoMinutos = duracaoMinutos;
    }


    public Element criarXML(Document docAudicoes){
        Element novaAudicao = docAudicoes.createElement("audicao");

        Element nome = docAudicoes.createElement("nome");
        nome.appendChild(docAudicoes.createTextNode(nome));
        novaAudicao.appendChild(nome);

        Element local = docAudicoes.createElement("local");
        local.appendChild(docAudicoes.createTextNode(local));
        novaAudicao.appendChild(local);

        Element data = docAudicoes.createElement("data");
        String dataString = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
        data.appendChild(docAudicoes.createTextNode(dataString));
        novaAudicao.appendChild(data);

        Element inicio = docAudicoes.createElement("inicio");
        String inicioString = Integer.toString(horasInicio) + ":" + Integer.toString(minutosInicio);
        inicio.appendChild(docAudicoes.createTextNode(inicioString));
        novaAudicao.appendChild(inicio);

        Element duracao = docAudicoes.createElement("duracao");
        String duracaoString = Integer.toString(duracaoHoras) + ":" + Integer.toString(duracaoMinutos);
        duracao.appendChild(docAudicoes.createTextNode(duracaoString));
        novaAudicao.appendChild(duracao);

        return novaAudicao;
    }
    
}




