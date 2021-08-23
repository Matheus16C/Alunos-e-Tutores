package modelo;

public class AulaIndividual extends Aula{
    private Aluno aluno;
    private Tutor tutor;
    private Conteudo conteudo;
    private State state;
    private String status;
    private int avaliacao;
    
    
    public Aluno getAluno() {
    	return aluno;
    }
    
    public void setAluno(Aluno aluno) {
    	this.aluno = aluno;
    }
    
    public int getAvaliacao() {
    	return avaliacao;
    }
    
    public void setAvaliacao(int avaliacao) {
    	this.avaliacao = avaliacao;
    }
    
    public Tutor getTutor() {
    	return tutor;
    }
    
    public void setTutor(Tutor tutor) {
    	this.tutor = tutor;
    }
    
    public Conteudo getConteudo() {
    	return conteudo;
    }
    
    public void setConteudo(Conteudo conteudo) {
    	this.conteudo = conteudo;
    }
    
    public State getState() {
    	return state;
    }
    
    public void changeState(State state) {
    	this.state = state;
    }
    
    public String getStatus() {
    	return status;
    }
    
    public void setStatus(String status) {
    	this.status = status;
    }
    
    public void notificaProfessor () {
    	System.out.println("Nova aula criada " + this.conteudo + " na data " + getData());
    }
    
    public void aulaAceita () {
    	System.out.println("Aula aceita pelo professor");
    }
    
    public void notificaAluno () {
    	System.out.println("Sua aula no conteúdo " + this.conteudo + " na data " + getData() + " foi aceita.");
    }
    
    public void notificaCancelamento () {
    	System.out.println("Sua aula no conteúdo " + this.conteudo + " na data " + getData() + " foi cancelada.");
    }
    
}
