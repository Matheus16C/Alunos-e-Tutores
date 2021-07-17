package modelo;

import java.util.Date;

public class AgendamentoDisponivel {

    private Date datasMarcadas;
    private Date datasIndisponiveis;
    private Date datasDisponiveis;

    public Date getDatasMarcadas() {
        return datasMarcadas;
    }

    public void setDatasMarcadas(Date datasMarcadas) {
        this.datasMarcadas = datasMarcadas;
    }
    
    public Date getDatasIndisponiveis() {
        return datasIndisponiveis;
    }

    public void setDatasIndisponiveis(Date datasIndisponiveis) {
        this.datasIndisponiveis = datasIndisponiveis;
    }
    
    public Date getDatasDisponiveis() {
        return datasDisponiveis;
    }

    public void setDatasDisponiveis(Date datasDisponiveis) {
        this.datasDisponiveis = datasDisponiveis;
    }

}
