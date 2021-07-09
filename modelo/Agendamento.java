package modelo;

import java.util.Date;

public class Agendamento {
    private Date data;
    private String link;
    private String obsDaAula;
    private Aluno aluno;
    private Tutor tutor;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getObsDaAula() {
        return obsDaAula;
    }

    public void setObsDaAula(String obsDaAula) {
        this.obsDaAula = obsDaAula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }


}
