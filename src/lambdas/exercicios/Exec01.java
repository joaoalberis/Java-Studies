package lambdas.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exec01 {
    public static void main(String[] args) {
        // O programa deve imprimir apenas os números pares da lista.

        // criando a lista com numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 10, 52, 53, 920, 127, 473, 12, 23, 834, 91, 13);

        // criando a função lambda
        Predicate<Integer> numerosPares = num -> num % 2 == 0;

        // Imprimindo apenas os valores pares.
        numeros.forEach(valor -> {
            if (numerosPares.test(valor)) System.out.println(valor);
        });

    }
}
