package Concretos;

import Abstratos.Pagamento;

public class PIX extends Pagamento{
    protected String chaveAleatoria;


    public boolean processarPagamento(){
        System.out.println("Processando pagamento com PIX...");
        System.out.println("Chave aleatoria: " + chaveAleatoria);
        return true;
    }

    public PIX(double valor, String formaDePagamento, String chaveAleatoria) {
        super(valor, formaDePagamento);
        this.chaveAleatoria = chaveAleatoria;
    }

    @Override
    public boolean efetuarPagamento(Compra compra) {
        return processarPagamento();
    }
    
}
