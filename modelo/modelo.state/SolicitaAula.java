package modelo;

public class SolicitaAula extends State{
	
	public SolicitaAula (AulaIndividual aula) {
		super(aula);
		aula.setStatus("Aula Solicitada");
		aula.notificaProfessor();
	}
	
	@Override
	public String onSolicita() {
		return "locked";
	}
	
	@Override
	public String onAceita() {
		aula.changeState(new Aceita(aula));
		return "aula aceita";
	}
	
	@Override
	public String onFinalizada() {
		return "locked";
	}
	
	@Override
	public String onCancelada() {
		aula.changeState(new Cancelada(aula));
		return "aula cancelada";
	}
	

}
