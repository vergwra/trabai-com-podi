package Exececoes;

public class ProdutoNaoEncontradoException extends SephoraException{

    public ProdutoNaoEncontradoException(String mensagem) {
        super("Produto Não encontrado");
    }

}
