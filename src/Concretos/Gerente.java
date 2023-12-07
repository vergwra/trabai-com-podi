package Concretos;

import Abstratos.Usuario;

public class Gerente extends Usuario {

    public Gerente(String nome, String endereco, String cPFString) {
        super(nome, endereco, cPFString);
        //TODO Auto-generated constructor stub
    }

    public void CancelaCompra() {

    }

    @Override
    public String toString() {
        return " Gerente: \n nome: " + nome + "CPF: " + CPF;
    }
    
}
