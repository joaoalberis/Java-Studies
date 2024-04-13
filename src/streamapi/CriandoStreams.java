package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;

        //Criando um stream a partir do Stream
        Stream<String> langs = Stream.of("Java", "lua", "JS\n");
        langs.forEach(print);

        // Criando um stream apartir de um array
        String[] maisLangs = { "Python", "Lisp", "Perl", "Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print); // criando um stream a partir de um array e definindo quais valores irão entrar no stream

        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print); // o stream é processado de forma paralela

        //Stream.generate(() -> "a").forEach(print); // gera de forma indefinida um valor
        //Stream.iterate(0, n -> n + 1).forEach(print); // gera de forma indefinida, seguindo a partir de uma seed(valor inicial)


    }
}
