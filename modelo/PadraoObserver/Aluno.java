package modelo.PadraoObserver;



import java.util.List;

public class Aluno extends Usuario implements Observer{
    //private List<Inscricao> inscricoes;

    public void update(Observable ob){
       AgendaAula agendada = ((AgendaAula) ob);
       Tutor tutor = agendada.getTutor();
       System.out.println("Destinatario:" + this.email);
       System.out.println("Aula agendada com professor: " + tutor.getNome() + "Na data: " + agendada.getData());
    }

    /*
    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }    

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }
    */
}
