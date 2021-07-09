package modelo;

import java.util.List;

public class Formacao {
    private String formacao;
    private boolean possueformacao;
    private int nivelInteresse;
    private List<String> disciplinas;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public boolean isPossueformacao() {
        return possueformacao;
    }

    public void setPossueformacao(boolean possueformacao) {
        this.possueformacao = possueformacao;
    }

    public int getNivelInteresse() {
        return nivelInteresse;
    }

    public void setNivelInteresse(int nivelInteresse) {
        this.nivelInteresse = nivelInteresse;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }


}
