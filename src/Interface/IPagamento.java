package Interface;

import Concretos.Compra;

public interface IPagamento {
    public boolean efetuarPagamento(Compra compra);
}
