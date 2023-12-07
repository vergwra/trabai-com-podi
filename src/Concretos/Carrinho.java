package Concretos;
import java.util.ArrayList;
import java.util.List;
import Abstratos.Produto;
import Exececoes.EstoqueInsuficienteException;


public class Carrinho {
    protected ArrayList<Produto> produtos = new ArrayList<>();
    
    public void AdicionarProduto(Produto produto) throws EstoqueInsuficienteException{
        if(produto.getQuantidadeDisponivel() == 0){
            throw new EstoqueInsuficienteException("Estoque insuficiente para o produto: " + produto.getNome());
        }
        produtos.add(produto);
        produto.decrementarQuantidade();
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        produto.incrementarQuantidade();
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void mostrarItens() {
        System.out.println("Itens no Carrinho:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Carrinho: \n itens: " + produtos;
    }
    

}
