package Paginas;

import Abstratos.Usuario;
import Concretos.*;

public class Data {
    public static Carrinho carrinho = new Carrinho();
    public static Usuario authedUsuario = null;

    public static void SetAuthedUser(Usuario usuario) {
        authedUsuario = usuario;
    }
}
