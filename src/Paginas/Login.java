package Paginas;

import javax.swing.*;

import Concretos.Cliente;
import Concretos.Gerente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;

    private JFrame LoginSuccededPage = null;
    public Login(JFrame LoginSuccededPage) {
        this.LoginSuccededPage = LoginSuccededPage;

        // Configurações básicas do JFrame
        setTitle("Sephora - Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação dos componentes
        JLabel labelUsuario = new JLabel("Usuário:");
        JLabel labelSenha = new JLabel("Senha:");

        campoUsuario = new JTextField(20);
        campoSenha = new JPasswordField(20);

        JButton botaoLogin = new JButton("Login");

        // Configuração do layout
        setLayout(new GridLayout(3, 2));

        // Adição dos componentes ao JFrame
        add(labelUsuario);
        add(campoUsuario);
        add(labelSenha);
        add(campoSenha);
        add(new JLabel()); // Espaço em branco
        add(botaoLogin);

        // Adição de um ouvinte de ação para o botão de login
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });
    }

    private void realizarLogin() {
        String usuario = campoUsuario.getText();
        char[] senhaChars = campoSenha.getPassword();
        String senha = new String(senhaChars);

        // Verificar as credenciais (substitua isso com a lógica de verificação real)
        if (usuario.equals("cliente") && senha.equals("senha")) {
            LoginSuccededPage.setVisible(true);
            dispose();

            Cliente clienteLogado = new Cliente("cliente", "null", "070.932.803-66", 0);
            Data.SetAuthedUser(clienteLogado);
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!", "Logado como CLIENTE", JOptionPane.OK_OPTION);
        } else if (usuario.equals("gerente") && senha.equals("senha")) {
            LoginSuccededPage.setVisible(true);
            dispose();

            Gerente gerenteLogado = new Gerente("gerente", "null", "070.932.803-66");
            Data.SetAuthedUser(gerenteLogado);
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!", "Logado como GERENTE", JOptionPane.OK_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
    }
}
