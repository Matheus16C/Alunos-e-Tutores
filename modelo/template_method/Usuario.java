package modelo;

import java.awt.*;
import java.util.Date;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String senha;
    private Formacao formacao;
    private Endereco endereco;
    private List<Inscricao> inscricoes;

    public Usuario(String nome, String cpf, Date dataNascimento, String email, String senha, Formacao formacao, Endereco endereco, List<Inscricao> inscricoes) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.formacao = formacao;
        this.endereco = endereco;
        this.inscricoes = inscricoes;
        createUsuario();
        createdType();
    }

    public void createUsuario() {System.out.println("Conta criada");}

    public abstract void createdType();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }




}
