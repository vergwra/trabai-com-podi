package Exececoes;

public class PagamentoRecusadoException extends SephoraException {
    public PagamentoRecusadoException(String mensagem) {
        super("Pagamento Recusado");
    }

}
