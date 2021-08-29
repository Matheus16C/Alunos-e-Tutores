package modelo;

import java.util.Date;

public class AgendaAulaIndividual extends AgendaAula{
    public AgendaAulaIndividual(Date data, Aluno aluno, Tutor tutor) {
        super(data, aluno, tutor);
    }

    @Override
    protected void agendamentoConfirmed() {
        System.out.println("Aula particular registrada");
        AulaIndividual aulaIndividual = new AulaIndividual();
        aulaIndividual.setAluno(getAluno());
        aulaIndividual.setTutor(getTutor());
    }

}
