/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;
import java.util.Date;
import modelo.Aula;
import modelo.Tutor;
/**
 *
 * @author cypri
 */
public abstract class BuilderAula {
    
    protected Date data;
    protected String link;
    protected Tutor tutor;
    
    public void buildLink(String link){
        this.link = link;
    }
    
    public void buildData(Date data){
        this.data = data;
    }
    
     
    public void buildTutor(Tutor tutor){
        this.tutor = tutor;
    }
    
    public abstract Aula getAula();
    
}
