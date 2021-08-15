/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

import java.util.List;
import modelo.Aluno;
import modelo.Aula;
import modelo.AulaColetiva;
import modelo.Conteudo;

/**
 *
 * @author cypri
 */
public class BuilderAulaColetiva extends BuilderAula {
    
    private String descricao;
    private String nome;
    private Conteudo conteudo;
    private List<Aluno> alunos;
    
    public void buildDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void BuildConteudo(Conteudo conteudo){
        this.conteudo = conteudo;
    }
    
    public void BuildNome(String nome){
        this.nome= nome;
    }
    
    public void buildAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }
    
    @Override
    public Aula getAula(){
        Aula aula = new AulaColetiva(data,link ,tutor , descricao, nome, conteudo, alunos);
        return aula;
    }
    
}
