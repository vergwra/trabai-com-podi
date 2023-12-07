package Concretos;

import Abstratos.Pagamento;

public class CartaoDeCredito extends Pagamento {
    private String numeroCartao;
    private String dataValidade;
    private String codigoSeguranca;

    public CartaoDeCredito(double valor, String formaDePagamento, String numeroCartao, String dataValidade,
            String codigoSeguranca) {
        super(valor, formaDePagamento);
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }


    @Override
    public boolean processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito...");
        return true;
    }


    @Override
    public boolean efetuarPagamento(Compra compra) {
        return processarPagamento();
    }

}
