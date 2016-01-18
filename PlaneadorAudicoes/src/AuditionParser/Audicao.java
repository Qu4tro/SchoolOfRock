package AuditionParser;

import java.util.ArrayList;

public class Audicao {

    private String nome;
    private String local;
    private String data;
    private String inicio;
    private int duracao; //minutos
    private ArrayList<Atuacao> atuacoes;

    public Audicao() {
        atuacoes = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(int day, int month, int year) {
        if (day > 0 && day <= 31 &&
            month > 0 && month <= 12 &&
            year > 1950){

            this.data = day + "-" + month + "-" + year;

         } else {
            //todo: Invalid date
        }
    }

    public void setInicio(int hours, int minutes) {
        if (hours >= 0 && hours <= 24 &&
                minutes >= 0 && minutes <= 60){

            this.inicio = hours + ":" + minutes;

        } else {
            //todo: Invalid time
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

    public void addAtuacao(Atuacao a){
        atuacoes.add(a);
    }

    public boolean checkDuration(){
        int total_duracao = 0;
        for (Atuacao a: atuacoes) {
            total_duracao += a.getDuracao();
        }

        return (total_duracao == duracao);
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public String getInicio() {
        return inicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public ArrayList<Atuacao> getAtuacoes() {
        return atuacoes;
    }    
    
    @Override
    public String toString() {
        return "Audicao{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ", data='" + data + '\'' +
                ", inicio='" + inicio + '\'' +
                ", duracao='" + duracao + '\'' +
                ", atuacoes=" + atuacoes +
                '}';
    }
}



/*
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
*/




