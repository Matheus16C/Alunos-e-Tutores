/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

import java.util.Date;
import modelo.Aluno;
import modelo.Aula;
import modelo.AulaIndividual;
import modelo.Conteudo;

/**
 *
 * @author cypri
 */
public class BuilderAulaIndividual extends BuilderAula {
    private Aluno aluno;
    
    private Conteudo conteudo;
    
    public void buildAluno(Aluno aluno){
        this.aluno = aluno;
    }
   
    
    public void buildConteudo(Conteudo conteudo){
        this.conteudo = conteudo;
    }
    
    @Override
    public Aula getAula(){
        Aula aula = new AulaIndividual(data, link, aluno, tutor, conteudo );
        
        return aula;
    }
}
