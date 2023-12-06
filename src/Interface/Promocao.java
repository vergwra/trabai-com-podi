package Interface;
import java.util.List;
import Abstratos.Produto;

public interface Promocao {
    void aplicarPromocao(Produto product, String promotionCode);
    
    List<String> getPromoDisponiveis();
}
