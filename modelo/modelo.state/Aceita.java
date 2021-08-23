package modelo;

public class Aceita extends State {
	
	public Aceita (AulaIndividual aula){
		super(aula);
		aula.notificaAluno();
	}
	
	@Override
	public String onSolicita() {
		return "locked";
	}
	
	@Override
	public String onAceita() {
		return "locked";
	}
	
	@Override
	public String onFinalizada() {
		aula.changeState(new Finalizada(aula));
		return "finalizada";
	}
	
	@Override
	public String onCancelada() {
		aula.changeState(new Cancelada(aula));
		return "aula cancelada";
	}

}
