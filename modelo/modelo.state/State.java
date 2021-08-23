package modelo;

public abstract class State {
	
	AulaIndividual aula;
	
	State(AulaIndividual aula){
		this.aula = aula;	
	}
	
	public abstract String onSolicita();
	public abstract String onAceita();
	public abstract String onFinalizada();
	public abstract String onCancelada();

}