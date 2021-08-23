package modelo;

public class Finalizada extends State {
	
	public Finalizada (AulaIndividual aula){
		super(aula);
		aula.setAvaliacao(5);
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
