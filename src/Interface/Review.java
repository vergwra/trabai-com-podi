import java.util.List;

public interface Review {
        
    void ProdutoAvaliado(Usuario user, Produto product, String reviewTexto, int classificacao);

    List<String> getRecentProductReviews(Produto product);
}
