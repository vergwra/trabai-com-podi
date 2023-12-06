package Paginas;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    private JPanel painelProdutos;
    private JButton btnIrParaCarrinho;

    public Home() {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        painelProdutos = new JPanel(new GridLayout(0, 1));
        btnIrParaCarrinho = new JButton("Carrinho");
        JScrollPane scrollPane = new JScrollPane(painelProdutos, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setLayout(new BorderLayout());
        
        ProdutoPanel pPanel = new ProdutoPanel("TESTE", 10.0);
        ProdutoPanel pPanel2 = new ProdutoPanel("TESTE2", 10.0);
        ProdutoPanel pPanel3 = new ProdutoPanel("TESTE2", 10.0);
        ProdutoPanel pPanel4 = new ProdutoPanel("TESTE2", 10.0);

        
        painelProdutos.add(pPanel);
        painelProdutos.add(pPanel2);
        painelProdutos.add(pPanel3);
        painelProdutos.add(pPanel4);



        add(scrollPane, BorderLayout.CENTER);
        add(btnIrParaCarrinho, BorderLayout.SOUTH);

        btnIrParaCarrinho.addActionListener(e -> {
            // Implemente a lógica para ir para a página do carrinho
        });
    }
}
