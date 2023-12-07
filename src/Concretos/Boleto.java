package Concretos;

import Abstratos.Pagamento;

public class Boleto extends Pagamento{
    protected String codigoDeBarras;


    public boolean processarPagamento(){
        System.out.println("Processando pagamento com boleto...");
        System.out.println("Boleto gerado: " + codigoDeBarras);
        return true;
    }

    public Boleto(double valor, String formaDePagamento, String codigoDeBarras) {
        super(valor, formaDePagamento);
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public String toString() {
        return " Boleto: \n codigo de barras: " + codigoDeBarras;
    }

    @Override
    public boolean efetuarPagamento(Compra compra) {
        return processarPagamento();
    }
    
    
    
}
