package lambdas.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exec02 {
    public static void main(String[] args) {
        //  O programa deve imprimir a lista de String resultante.

        // Criando a lista com os valores a serem convertidos
        List<Integer> valores = Arrays.asList(1, 2, 3, 5, 6, 7, 1,2 ,51 ,51 ,213, 51, 1235, 532);

        // criando a função lambda
        Function<List<Integer>, List<String>> convertToString = valor -> {
            List<String> valorConvertido = new ArrayList<>();
            valor.forEach(value -> valorConvertido.add(value.toString()));
            return valorConvertido;
        };

        // Imprimindo a lista convertida
        System.out.println(convertToString.apply(valores));
    }
}
