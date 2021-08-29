package modelo;

import java.util.Date;

public class AgendaAulaColetiva extends AgendaAula {

    public AgendaAulaColetiva(Date data, Aluno aluno, Tutor tutor) {
        super(data, aluno, tutor);
    }

    @Override
    protected void agendamentoConfirmed() {
        System.out.println("Registro no evento realizado com sucesso");
        AulaIndividual aulaIndividual = new AulaIndividual();
        aulaIndividual.setAluno(getAluno());
        aulaIndividual.setTutor(getTutor());
    }
}
