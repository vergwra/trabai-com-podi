package Paginas;

import javax.swing.*;

import Abstratos.Produto;

import java.awt.*;

public class CarrinhoProdutoPanel extends JPanel {

    private JLabel lblNome;
    private JLabel lblPreco;
    private JLabel lblMarca;
    private JLabel lblModelo;


    public CarrinhoProdutoPanel(Produto produto) {
        // Configurações básicas do JPanel
        setLayout(new GridLayout(0, 1));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Inicializações
        lblNome = new JLabel(produto.getNome());
        lblMarca = new JLabel("Marca: " + produto.getMarca());
        lblModelo = new JLabel("Modelo: " + produto.getModelo());
        lblPreco = new JLabel("Preço: $" + produto.getPreco());


        // Adiciona componentes ao JPanel
        add(lblNome, BorderLayout.NORTH);
        add(lblMarca, BorderLayout.CENTER);
        add(lblModelo, BorderLayout.CENTER);
        add(lblPreco, BorderLayout.CENTER);
    }

    // Adicione métodos adicionais conforme necessário para interagir com o produto
}
