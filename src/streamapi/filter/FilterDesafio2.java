package streamapi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio2 {
    public static void main(String[] args) {

        Produto p1 = new Produto(1.99, "Lapis", 0.35, 0);
        Produto p2 = new Produto(4899.89, "Notebook", 0.32, 0);
        Produto p3 = new Produto(30, "Caderno", 0.45, 0);
        Produto p4 = new Produto(1200, "Impressora", 0.40, 0);
        Produto p5 = new Produto(3100, "Ipad", 0.29, 0);
        Produto p6 = new Produto(1900, "Relogio", 0.12, 0);
        Produto p7 = new Produto(800, "Monitor", 0.31, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);



        Predicate<Produto> filterPromocao = n -> n.desconto >= 0.30;
        Predicate<Produto> filterFrete = n -> n.frete == 0;
        Predicate<Produto> filterPreco = n -> n.preco >= 500;
        Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;

        produtos.stream()
                .filter(filterPromocao)
                .filter(filterFrete)
                .filter(filterPreco)
                .map(chamadaPromocional)
                .forEach(System.out::println);
    }
}
