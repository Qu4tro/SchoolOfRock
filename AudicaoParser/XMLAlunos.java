/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

/**
 *
 * @author patricia
 */
public class XMLAlunos {
    static DocumentBuilderFactory builderFactory;
    static DocumentBuilder builder;
    static Document alunos;

    
public XMLAlunos() throws SAXException{
    builderFactory = DocumentBuilderFactory.newInstance();
    builder = null;
    try {
         builder = builderFactory.newDocumentBuilder();
    } catch (ParserConfigurationException e) {
        e.printStackTrace();  
    }

    try {
        alunos = (Document) builder.parse(new FileInputStream("alunos.xml"));
    } catch (IOException e) {
        e.printStackTrace();
    }

}
    
public static int findAluno(String id) throws XPathExpressionException{
    XPath xPath = XPathFactory.newInstance().newXPath();
    String expression = "/aluno[id='"+id+"']";
    Node node = (Node) xPath.compile(expression).evaluate(alunos, XPathConstants.NODE);
    if(node!=null){
        return 1;}
    else return 0;
    }
    

public static void main(String[] args){
        try {
            new XMLAlunos();
        } catch (SAXException ex) {
            Logger.getLogger(XMLAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int res=findAluno("#a67665");
            System.out.println(res);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XMLAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
}
  
}