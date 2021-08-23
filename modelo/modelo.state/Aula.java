package modelo;

import java.util.Date;

public abstract class Aula {
    private Date data;
    private String link;
   
    
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

    public String getLink() {
        return link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }

}
