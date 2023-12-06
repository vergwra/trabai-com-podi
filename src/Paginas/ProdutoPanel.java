package Paginas;

import javax.swing.*;
import java.awt.*;

public class ProdutoPanel extends JPanel {

    private JLabel lblNome;
    private JLabel lblPreco;
    private JButton btnAdicionarAoCarrinho;

    public ProdutoPanel(String nome, double preco) {
        // Configurações básicas do JPanel
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Inicializações
        lblNome = new JLabel(nome);
        lblPreco = new JLabel("Preço: $" + preco);
        btnAdicionarAoCarrinho = new JButton("Adicionar ao Carrinho");

        // Adiciona componentes ao JPanel
        add(lblNome, BorderLayout.NORTH);
        add(lblPreco, BorderLayout.CENTER);
        add(btnAdicionarAoCarrinho, BorderLayout.SOUTH);
    }

    // Adicione métodos adicionais conforme necessário para interagir com o produto
}
