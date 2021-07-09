package modelo;

import java.util.Date;

public class Aula {
    private Date data;
    private String link;
    private Float valor;

    public void setData(Date data) {
        this.data = data;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public String getLink() {
        return link;
    }

    public Float getValor() {
        return valor;
    }


}
