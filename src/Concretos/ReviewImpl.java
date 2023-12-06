package Concretos;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import Abstratos.Produto;
import Abstratos.Usuario;
import Interface.Review;


public class ReviewImpl implements Review {
    private Map<Produto, List<Avaliacao>> avaliacoesPorProduto;

    public ReviewImpl() {
        this.avaliacoesPorProduto = new HashMap<>();
    }

    @Override
    public void ProdutoAvaliado(Usuario usuario, Produto produto, String textoAvaliacao, int classificacao) {
        Avaliacao avaliacao = new Avaliacao(usuario, textoAvaliacao, classificacao);

        if (avaliacoesPorProduto.containsKey(produto)) {
            avaliacoesPorProduto.get(produto).add(avaliacao);
        } else {
            List<Avaliacao> avaliacoes = new ArrayList<>();
            avaliacoes.add(avaliacao);
            avaliacoesPorProduto.put(produto, avaliacoes);
        }
    }

    @Override
    public List<Avaliacao> getRecentProductReviews(Produto product) {
        return avaliacoesPorProduto.getOrDefault(product, new ArrayList<>());
    }



}
