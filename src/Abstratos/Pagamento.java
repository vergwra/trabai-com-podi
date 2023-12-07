package Abstratos;

import Interface.IPagamento;

public abstract class Pagamento implements IPagamento {
    protected double valor;
    protected String formaDePagamento;
    
    public Pagamento(double valor, String formaDePagamento) {
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
    }

    public abstract boolean processarPagamento();

    public String toString() {
        return "Pagamento no valor de=" + valor + "";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
