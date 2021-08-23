package modelo;

public class Cancelada extends State {
	
	public Cancelada (AulaIndividual aula){
		super(aula);
		aula.notificaCancelamento();
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
		return "locked";
	}
	
	@Override
	public String onCancelada() {
		return "locked";
	}

}
