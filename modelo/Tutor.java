package modelo;

import java.util.List;

public class Tutor extends Usuario{
    private String descricao;
    private List<inscricao> inscritos;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
