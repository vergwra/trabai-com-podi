package Paginas;

import javax.swing.*;

import Abstratos.Pagamento;
import Abstratos.Produto;
import Abstratos.Usuario;
import Concretos.Boleto;
import Concretos.Carrinho;
import Concretos.CartaoDeCredito;
import Concretos.Compra;
import Concretos.PIX;
import Exececoes.PagamentoRecusadoException;
import Interface.IPagamento;
import javafx.event.ActionEvent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;

public class CompraPage extends JFrame implements ActionListener {
    private JPanel painelProdutos;
    private JButton btnPagar;
    private JButton btnVoltar;

    private JComboBox<String> pagamentoSeletor;

    private JLabel totalAPagar;
    private String metodoString;

    public CompraPage(Usuario usuario, Carrinho carrinho) {
        Compra compra = new Compra(usuario, carrinho);

        setTitle("Sephora - Compra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        String[] metodos = new String[3];
        metodos[0] = "Cartao de Credito";
        metodos[1] = "PIX";
        metodos[2] = "Boleto";

        pagamentoSeletor = new JComboBox<String>(metodos);
        pagamentoSeletor.setSelectedIndex(0);
        pagamentoSeletor.addActionListener(this);
        metodoString = metodos[0];
        btnPagar = new JButton("Pagar com "+ metodos[0]);

        totalAPagar = new JLabel("Total a pagar: " + compra.getValorTotal());
        
        setLayout(new BorderLayout());

        add(totalAPagar, BorderLayout.NORTH);
        add(pagamentoSeletor);
        add(btnPagar, BorderLayout.SOUTH);

        btnPagar.addActionListener(e -> {
            PagarCompra(compra);
        });
    }

    private void PagarCompra(Compra compra) {
        IPagamento pagamento = null;
        if (metodoString.equals("PIX")) {
            String chaveAleatoria = "AUYSGDYUAEG#bdsicbs3923746BASIUDg";
            pagamento = new PIX(compra.getValorTotal(), metodoString, chaveAleatoria);
        
            JOptionPane.showMessageDialog(this, "PIX: " + chaveAleatoria);
        }
        else if (metodoString.equals("Cartao de Credito")) {
            String numero = JOptionPane.showInputDialog("Digite o numero do cartao: ");
            String dataValidade = JOptionPane.showInputDialog("Data de validade: ");
            String ccv = JOptionPane.showInputDialog("Codigo de Seguranca: ");

            pagamento = new CartaoDeCredito(compra.getValorTotal(), metodoString, numero, dataValidade, ccv);
        }
        else {
            String codigoDeBarras = "0010100111101010101010111110000110101";
            JOptionPane.showMessageDialog(this, "Codigo de Barras: " + codigoDeBarras);
            pagamento = new Boleto(compra.getValorTotal(), metodoString, codigoDeBarras);
        }

        int r = JOptionPane.showConfirmDialog(this, "TEM CERTEZA QUE DESEJA CONTINUAR?");
        if (r != 0) {
            return;
        }

        try {
            compra.realizarPagamento(pagamento);
            JOptionPane.showMessageDialog(this, "Compra realizada!", "Pagamento processado com sucesso.", JOptionPane.OK_OPTION);
            this.setVisible(false);
            new Home().setVisible(true);
            Data.carrinho = new Carrinho();
            dispose();
        } catch (PagamentoRecusadoException e) {
            JOptionPane.showMessageDialog(this, "Pagamento nao efetuado", "Nao foi possivel processar o pagamento", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        metodoString = (String)cb.getSelectedItem();
        btnPagar.setText("Pagar com " + metodoString);
    }
}
