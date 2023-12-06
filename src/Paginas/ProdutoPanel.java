package Paginas;

import javax.swing.*;

import Abstratos.Produto;
import Concretos.Carrinho;
import Exececoes.EstoqueInsuficienteException;

import java.awt.*;
import java.awt.event.ActionListener;

public class ProdutoPanel extends JPanel {

    private JLabel lblNome;
    private JLabel lblPreco;
    private JLabel lblQuantidade;
    private JLabel lblMarca;
    private JLabel lblModelo;

    private JButton btnAdicionarAoCarrinho;

    public ProdutoPanel(Produto produto, Home home) {
        // Configurações básicas do JPanel
        setLayout(new GridLayout(0, 1));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Inicializações
        lblNome = new JLabel(produto.getNome());
        lblMarca = new JLabel("Marca: " + produto.getMarca());
        lblModelo = new JLabel("Modelo: " + produto.getModelo());
        lblPreco = new JLabel("Preço: $" + produto.getPreco());
        lblQuantidade = new JLabel("Quantidade Disponivel: " + produto.getQuantidadeDisponivel());

        btnAdicionarAoCarrinho = new JButton("Adicionar ao Carrinho");

        // Adiciona componentes ao JPanel
        add(lblNome, BorderLayout.NORTH);
        add(lblMarca, BorderLayout.CENTER);
        add(lblModelo, BorderLayout.CENTER);
        add(lblPreco, BorderLayout.CENTER);
        add(lblQuantidade, BorderLayout.CENTER);
        add(btnAdicionarAoCarrinho, BorderLayout.SOUTH);

        btnAdicionarAoCarrinho.addActionListener(e -> {
            home.AdicionarProdutoAoCarrinho(produto);
            lblQuantidade.setText("Quantidade Disponivel: " + (produto.getQuantidadeDisponivel()));
        });
    }

    // Adicione métodos adicionais conforme necessário para interagir com o produto
}
