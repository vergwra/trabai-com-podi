package Concretos;

import Abstratos.Produto;

public class Maquiagem extends Produto {

    public Maquiagem(String nome, String marca, String modelo, int quantidadeDisponivel, double preco,
            String detalhes) {
        super(nome, marca, modelo, quantidadeDisponivel, preco, detalhes);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double CalcularDesconto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularDesconto'");
    }

    @Override
    public void Detalhes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Detalhes'");
    }
    
}
