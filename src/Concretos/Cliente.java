package Concretos;

import Abstratos.Usuario;

public class Cliente extends Usuario {
    protected int pontos;

    public Cliente(String nome, String endereco, String cPF, int pontos) {
        super(nome, endereco, cPF);
        this.pontos = pontos;
        //TODO Auto-generated constructor stub
    }
    
    public void Wishlist() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Wishlist'");
    }

    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return " Cliente: \n nome: " + nome + "\n CPF: " + CPF + " \n endereço: " + endereco +  "\n pontos:" + pontos  ;
    }
    
}
