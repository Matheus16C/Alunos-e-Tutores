package modelo;

import java.time.LocalTime;

public class Inscricao {
    private LocalTime tempo;
    private Integer aulasAssistidas;
    private Aluno aluno;

    public LocalTime getTempo() {
        return tempo;
    }

    public Integer getAulasAssistidas() {
        return aulasAssistidas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }

    public void setAulasAssistidas(Integer aulasAssistidas) {
        this.aulasAssistidas = aulasAssistidas;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
