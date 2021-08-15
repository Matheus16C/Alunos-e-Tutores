/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

import java.util.Date;
import java.util.List;
import modelo.Aluno;
import modelo.Aula;
import modelo.Conteudo;
import modelo.Tutor;

/**
 *
 * @author cypri
 */
public class DirectorAulaColetiva {
   public Aula builder(Date data, String link,Tutor tutor ,String descricao, String nome, Conteudo conteudo, List<Aluno> alunos){
       BuilderAulaColetiva b = new BuilderAulaColetiva();
       b.buildData(data);
       b.buildLink(link);
       b.buildTutor(tutor);
       b.buildDescricao(descricao);
       b.BuildNome(nome);
       b.BuildConteudo(conteudo);
       b.buildAlunos(alunos);
       
       return b.getAula();
   }
    
}
