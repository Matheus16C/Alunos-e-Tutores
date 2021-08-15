/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

import java.util.Date;
import modelo.Aluno;
import modelo.Aula;
import modelo.Conteudo;
import modelo.Tutor;

/**
 *
 * @author cypri
 */
public class DirectorAulaIndividual {
    public Aula Builder(String link, Date data, Aluno aluno, Tutor tutor, Conteudo conteudo)
    {
        BuilderAulaIndividual b = new BuilderAulaIndividual();
        b.buildLink(link);
        b.buildData(data);
        b.buildAluno(aluno);
        b.buildTutor(tutor);
        b.buildConteudo(conteudo);
        
        
        
        return b.getAula();
    }
}
