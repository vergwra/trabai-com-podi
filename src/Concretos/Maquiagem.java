package Concretos;

import Abstratos.Produto;

public class Maquiagem extends Produto {

    public Maquiagem(String nome, String marca, String modelo, int quantidadeDisponivel, double preco,
            String detalhes) {
        super(nome, marca, modelo, quantidadeDisponivel, preco, detalhes);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double CalcularDesconto(double desconto) {
        preco = preco - ((1/100) * desconto); 
        return preco;
    }

    @Override
    public void Detalhes() {
        System.out.println(detalhes);
    }

    @Override
    public String toString() {
        return " Maquiagem: \n marca: " + marca + "\n nome: " + nome + "\n modelo: " + modelo + "\n preço: " + preco + "\n detalhes: " + detalhes;
    }
    
    
}
