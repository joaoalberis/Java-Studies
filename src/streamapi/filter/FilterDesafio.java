package streamapi.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {
    public static void main(String[] args) {
        /*
        1. Criar 2 funções lambdas para utilizar nos filtros
        2. Ao final usar o map
         */

        Carro c1 = new Carro("Vermelho", 7200);
        Carro c2 = new Carro("Rosa", 5900);
        Carro c3 = new Carro("Verde", 6400);
        Carro c4 = new Carro("Vermelho", 7800);
        Carro c5 = new Carro("Preto", 4000);
        Carro c6 = new Carro("Roxo", 3500);

        Predicate<Carro> filterPreco = n -> n.preco >= 5900;
        Predicate<Carro> filterCor = n -> n.cor.equals("Vermelho");
        Function<Carro, String> mensagem = n -> "O seu carro custará -> " + n.preco + " na cor Vermelha";

        List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6);

        carros.stream()
                .filter(filterCor)
                .filter(filterPreco)
                .map(mensagem)
                .forEach(System.out::println);
    }
}
