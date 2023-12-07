package Concretos;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import Abstratos.Pagamento;
import Abstratos.Produto;
import Abstratos.Usuario;
import Exececoes.PagamentoRecusadoException;
import Interface.IPagamento;

public class Compra {
    private Usuario comprador;
    private Carrinho carrinho;
    private double valorTotal;
    private Date dataCompra;
    private IPagamento pagamento;
    
    public double getValorTotal() {
        return valorTotal;
    }

    public Compra(Usuario comprador, Carrinho carrinho) {
        this.comprador = comprador;
        this.carrinho = carrinho;
        this.dataCompra = null;
        this.valorTotal = carrinho.calcularTotal();
    }
    public void realizarPagamento(IPagamento pagamento) throws PagamentoRecusadoException {
        boolean top = pagamento.efetuarPagamento(this);

        if (top == false) {
            throw new PagamentoRecusadoException("Pagamento recusado para a compra de R$:" + valorTotal);
        }

        this.pagamento = pagamento;
        RegistroLog.registrar("Compra realizada: " + this);
    }



    
    public void solicitarAvaliacoes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja deixar uma avaliação para os produtos comprados? \n Sim \n Não");
        String EsseOuEnne = scanner.nextLine();



        System.out.println("Deixe uma avaliação para os produtos comprados:");

        for (Produto produto : carrinho.getProdutos()) {
            System.out.print("Avaliação para " + produto.getNome() + ": ");
            String textoAvaliacao = scanner.nextLine();

            
            int classificacao;
            do {
                System.out.print("Digite a classificação para o produto " + produto.getNome() + " (de 1 a 5): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, digite um número válido de 1 a 5.");
                    scanner.next();
                }
    
                classificacao = scanner.nextInt();
    
                if (classificacao < 1 || classificacao > 5) {
                    System.out.println("Por favor, digite uma classificação válida de 1 a 5.");
                }
            } while (classificacao < 1 || classificacao > 5);



            Avaliacao avaliacao = new Avaliacao(comprador, textoAvaliacao, classificacao);
            produto.adicionarAvaliacao(avaliacao);
        }
    }
    @Override
    public String toString() {
        return ("  Detalhes da compra: \n cliente: " + comprador + "\n itens do carrinho: " + carrinho + "\n  valor da compra: " + valorTotal
                + "\n data da compra: " + dataCompra + "\n forma de pagamento: " + pagamento + "");
    }

}
