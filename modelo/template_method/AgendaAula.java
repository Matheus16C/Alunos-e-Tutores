package modelo;

import java.util.Date;

public abstract class AgendaAula {
    private Date data;
    private Aluno aluno;
    private Tutor tutor;

    public AgendaAula(Date data, Aluno aluno, Tutor tutor) {
        this.aluno = aluno;
        this.data = data;
        this.tutor = tutor;
        this.agendamentoConfirmed();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    protected abstract void agendamentoConfirmed();

}
