package Abstratos;

import Concretos.Avaliacao;

public abstract class Produto {
    protected String nome;
    protected String marca;
    protected String modelo;
    protected int quantidadeDisponivel;
    protected double preco;
    protected String detalhes;
    


    public void decrementarQuantidade() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
        }
    }

    public void incrementarQuantidade() {
        quantidadeDisponivel++;
    }



    public Produto(String nome, String marca, String modelo, int quantidadeDisponivel, double preco, String detalhes) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.detalhes = detalhes;
    }


    public String getMarca() {
        return marca;}


    public void setMarca(String marca) {
        this.marca = marca;}


    public String getModelo() {
        return modelo;}


    public void setModelo(String modelo) {
        this.modelo = modelo;}


    public double getPreco() {
        return preco;}


    public void setPreco(double preco) {
        this.preco = preco;}
    
    public abstract double CalcularDesconto(double desconto);

    public abstract void Detalhes();


    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }


    public void setQuantidadeDisponievel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }


    public String getDetalhes() {
        return detalhes;
    }


    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
    }
    
}
