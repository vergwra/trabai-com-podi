package Concretos;

import Abstratos.Usuario;

public class Cliente extends Usuario {
    protected int pontos;

    public Cliente(String nome, String endereco, String cPF, int pontos) {
        super(nome, endereco, cPF);
        this.pontos = pontos;
        //TODO Auto-generated constructor stub
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

    @Override
    public void VisualizarPerfil() {
        System.out.println("Você é Cliente");
        System.out.println("nome:" + nome +"\n CPF"+ CPF);
    }
    
}
