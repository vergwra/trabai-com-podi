package Paginas;

import javax.swing.*;

import Abstratos.Produto;
import Concretos.Carrinho;
import Exececoes.EstoqueInsuficienteException;
import Repositorios.ProductRepository;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Home extends JFrame {
    private JPanel painelProdutos;
    private JButton btnIrParaCarrinho;

    public void AdicionarProdutoAoCarrinho(Produto p) {
        try {
            Data.carrinho.AdicionarProduto(p);
            btnIrParaCarrinho.setText("Carrinho - " + Data.carrinho.getProdutos().size());
        } catch (EstoqueInsuficienteException e) {
            JOptionPane.showMessageDialog(this, "Estoque insuficiente");
            e.printStackTrace();
        }
        repaint();
        
    }

    public Home() {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        painelProdutos = new JPanel(new GridLayout(0, 1));
        btnIrParaCarrinho = new JButton("Carrinho - 0");
        JScrollPane scrollPane = new JScrollPane(painelProdutos, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setLayout(new BorderLayout());
        
        List<Produto> produtos = ProductRepository.find(p -> true);
        produtos.forEach(p -> {
            ProdutoPanel pPanel = new ProdutoPanel(p, this);
            painelProdutos.add(pPanel);
        });

        add(scrollPane, BorderLayout.CENTER);
        add(btnIrParaCarrinho, BorderLayout.SOUTH);

        btnIrParaCarrinho.addActionListener(e -> {
            new CarrinhoPage().setVisible(true);
            dispose();
        });
    }
}
