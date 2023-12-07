package Concretos;

import Abstratos.Produto;
import Abstratos.Usuario;
import Interface.Promocao;

public class Gerente extends Usuario {

    public Gerente(String nome, String endereco, String cPFString) {
        super(nome, endereco, cPFString);
        //TODO Auto-generated constructor stub
    }

    public void CancelarCompra(Compra compra) {
        //compra.cancelar();
    }

    public void BanirUsuario(Usuario usuario) {
        // usuario.bannedAt = new DateTime();
    }

    public void AplicarPromocao(Promocao promocao, Produto produto, String code) {
        promocao.aplicarPromocao(produto, code);
    }
}
