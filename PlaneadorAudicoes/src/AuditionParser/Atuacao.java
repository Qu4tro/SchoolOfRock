package AuditionParser;

import javax.xml.xpath.XPathExpressionException;
import java.util.ArrayList;

public class Atuacao {

    DataInterface data;
    String nome;
    int duracao;
    ArrayList<String> professores;
    ArrayList<String> alunos;
    ArrayList<String> pecas;


    public Atuacao(DataInterface data, String nome){
        this.data = data;
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.pecas = new ArrayList<>();
    }

    public void addAluno(String id){

        try {
            if (data.existeAluno(id)){
                alunos.add(id);
            }
        } catch (XPathExpressionException exception){
            //todo: Invalid XML alunos

        }
    }


    public void addProfessor(String id){

        try {
            if (data.existeProfessor(id)){
                professores.add(id);
            }
        } catch (XPathExpressionException exception){
            //todo: Invalid XML professores

        }
    }

    public void addPeca(String id){
        try {
            if (data.existeObra(id)){
                pecas.add(id);
            }
        } catch (XPathExpressionException exception){
            //todo: Invalid XML obras

        }
    }

    public void setDuracao(int hours, int minutes) {
        if (hours >= 0 && hours <= 24 &&
                minutes >= 0 && minutes <= 60){

            this.duracao = hours * 60 + minutes;

        } else {
            //todo: Invalid time
        }
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public ArrayList<String> getProfessores() {
        return professores;
    }

    public ArrayList<String> getAlunos() {
        return alunos;
    }

    public ArrayList<String> getPecas() {
        return pecas;
    }

    @Override
    public String toString() {
        return "Atuacao{" +
                "nome='" + nome + '\'' +
                ", duracao='" + duracao + '\'' +
                ", professores=" + professores +
                ", alunos=" + alunos +
                ", pecas=" + pecas +
                '}';
    }

}
