package Repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Abstratos.Produto;
import Concretos.Maquiagem;

public class ProductRepository {
    private static List<Produto> produtos = new ArrayList<Produto>();


    public static List<Produto> find(Predicate<Produto> p) {
        ArrayList<Produto> _p = new ArrayList<Produto>();
        _p.add(new Maquiagem("BLUSH LIQUIDO", "Rare Beauty", "Soft Pinch", 5, 159.90, "Um blush líquido leve e de longa duração que se espalha e cria lindas camadas para um rubor suave e saudável."));        
        _p.add(new Maquiagem("CORRETIVO LÍQUIDO", "RARE BEAUTY", "LIQUID TOUCH", 5, 189.90, "Um corretivo leve e hidratante com cobertura média a total, de longa duração, que não craquela e ilumina a pele."));
        _p.add(new Maquiagem("MÁSCARA DE CÍLIOS", "KYLIE COSMETICS", "KYLASH", 5, 149.90, "Se você está em busca do segredo para cílios volumosos, alongados e cheios de personalidade, então a Máscara de Cílios Kylie Cosmetics Kylash, será sua aliada definitiva para um olhar irresistível e marcante."));
        _p.add(new Maquiagem("CORRETIVO LIQUIDO", "DIOR", "FOREVER SKIN CONCEALER", 5, 285.00, "Em uma única passada, este corretivo multiuso de alta cobertura com textura cremosa, esconde olheiras, vermelhidão localizada, manchas e imperfeições para uma correção impecável e disfarce de olheiras, sem transferência. De manhã à noite, alisa e realça a pele, sem marcar as linhas do rosto. Ele resiste em todas as condições de calor e umidade."));
        _p.add(new Maquiagem("BASE", "NARS", "LIGHT REFLECTING", 5, 339.90, "A base NARS atua como maquiagem e skincare, desfocando instantaneamente as imperfeições, suavizando a aparência da pele e dos poros texturizados, além de ajuda a camuflar tom desigual, pontos escuros e vermelhidão."));
        _p.add(new Maquiagem("PÓ TRANSLUCIDO", " LAURA MERCIER", "TRANSLUCENT LOOSE SETTING POWDER", 5, 259.90, "O icônico e best seller produto de Laura Mercier, vencedor de inúmeros prêmios e número 1 nos Estados Unidos* e também no Brasil**, é o seu pó essencial para selar a maquiagem, controlando a oleosidade e deixando um efeito de seda mate suave, dissimulando as linhas finas e imperfeições e sem adicionar cor à maquiagem aplicada anteriormente."));
        _p.add(new Maquiagem("Blush Liquido", "Rare Beauty", "", 5, 159.90, ""));

        return _p.stream().filter(p).collect(Collectors.toList());
    }
}
