package modelo.PadraoObserver;

import java.util.List;


public class Tutor extends Usuario{
    private String descricao;
    //private List<Inscricao> inscritos;


    public void update(Observable ob){
        AgendaAula agendada = ((AgendaAula) ob);
        Aluno aluno = agendada.getAluno();
        System.out.println("Destinatario:" + this.email);
        System.out.println("Aula agendada com professor: " + aluno.getNome() + "Na data: " + agendada.getData());
    }
    /*
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    */
}
