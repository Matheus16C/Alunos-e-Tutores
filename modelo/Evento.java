package modelo;

import java.util.Date;

public class Evento extends Aula {
    private String tema;
    private String nome;
    private Conteudo conteudo;
    private Tutor tutor;
    private List<Aluno> alunoList;

    public Tutor getTutor() {
        return tutor;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }


    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTema() {
        return tema;
    }

    public String getNome() {
        return nome;
    }

}
