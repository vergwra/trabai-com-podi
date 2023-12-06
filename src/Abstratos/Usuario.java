public abstract class Usuario {
    protected String nome;
    protected String endereco;
    protected String CPF;
    protected int pontos;

    
    public Usuario(String nome, String endereco, String cPF, int pontos) {
        this.nome = nome;
        this.endereco = endereco;
        CPF = cPF;
        this.pontos = pontos;
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
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public abstract void Wishlist();
}
