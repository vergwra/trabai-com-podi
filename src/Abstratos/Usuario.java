package Abstratos;

public abstract class Usuario {
    protected String nome;
    protected String endereco;
    protected String CPF;

    
    public Usuario(String nome, String endereco, String cPF) {
        this.nome = nome;
        this.endereco = endereco;
        CPF = cPF;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
}
