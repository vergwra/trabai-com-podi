package Concretos;

import Abstratos.Usuario;

public class Avaliacao {
    private Usuario usuario;
    private String texto;
    private int classificacao;

    public Avaliacao(Usuario usuario, String texto, int classificacao) {
        this.usuario = usuario;
        this.texto = texto;
        this.classificacao = classificacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTexto() {
        return texto;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
