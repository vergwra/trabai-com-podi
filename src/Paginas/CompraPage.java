package Paginas;

import javax.swing.*;

import Abstratos.Produto;
import Abstratos.Usuario;
import Concretos.Compra;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

public class CompraPage extends JFrame {
    private JPanel painelProdutos;
    private JButton btnFinalizarCompra;
    private JButton btnVoltar;

    private JLabel total;

    public CompraPage(Usuario usuario, Compra compra) {
        setTitle("Sephora - Compra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        painelProdutos = new JPanel(new GridLayout(0, 1));
        btnFinalizarCompra = new JButton("Comprar "+ Data.carrinho.getProdutos().size() + " Itens - " +  "(Total: R$" + Data.carrinho.calcularTotal() + ")");
        btnVoltar = new JButton("Voltar");



        JScrollPane scrollPane = new JScrollPane(painelProdutos, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setLayout(new BorderLayout());
        
        List<Produto> produtos = Data.carrinho.getProdutos();
        produtos.forEach(p -> {
            CarrinhoProdutoPanel pPanel = new CarrinhoProdutoPanel(p);
            painelProdutos.add(pPanel);
        });

        add(scrollPane, BorderLayout.CENTER);
        add(btnFinalizarCompra, BorderLayout.SOUTH);

        btnFinalizarCompra.addActionListener(e -> {
            // Implemente a lógica para ir para a página do carrinho
        });
    }
}
