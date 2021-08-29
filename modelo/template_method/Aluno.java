package modelo;
import java.util.Date;
import java.util.List;

public class Aluno extends Usuario{

    public Aluno(String nome, String cpf, Date dataNascimento, String email, String senha, Formacao formacao, Endereco endereco, List<Inscricao> inscricoes) {
        super(nome, cpf, dataNascimento, email, senha, formacao, endereco, inscricoes);
    }


    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }

    @Override
    public void createdType() {
        System.out.println("Conta de Aluno");
        System.out.println("Inscricoes inseridas");
        System.out.println("Dados confirmados");
    }

}
