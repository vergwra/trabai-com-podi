package Interface;
import java.util.List;

import Abstratos.Produto;
import Abstratos.Usuario;
import Concretos.Avaliacao;

public interface Review {
        
    void ProdutoAvaliado(Usuario user, Produto product, String reviewTexto, int classificacao);

    List<Avaliacao> getRecentProductReviews(Produto product);
}
