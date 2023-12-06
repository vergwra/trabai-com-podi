package Exececoes;

public class EstoqueInsuficienteException extends SephoraException{
    public EstoqueInsuficienteException(String mensagem) {
        super("Estoque Insuficiente");
    }

}
