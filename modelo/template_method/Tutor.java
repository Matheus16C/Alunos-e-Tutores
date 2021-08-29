package modelo;

import java.util.Date;
import java.util.List;

public class Tutor extends Usuario{
    private String descricao;

    public Tutor(String nome, String cpf, Date dataNascimento, String email, String senha, Formacao formacao, Endereco endereco, List<Inscricao> inscricoes) {
        super(nome, cpf, dataNascimento, email, senha, formacao, endereco, inscricoes);
    }

    @Override
    public void createdType() {
        System.out.println("Conta de Tutor");
        System.out.println("Descrição definida");
        System.out.println("Inscricoes inseridas")
        System.out.println("Dados confirmados");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Inscricao> getInscritos() {
        return inscritos;
    }

    public void setInscritos(List<Inscricao> inscritos) {
        this.inscritos = inscritos;
    }
}
