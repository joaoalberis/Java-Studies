package streamapi.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int total = nums.stream().reduce(soma).get();
        System.out.println(total);

        //Com o uso do parallelStream, O valor inicial(100) é passado a cada chamada da função lambda
        Integer total2 = nums.parallelStream().reduce(100, soma);
        System.out.println(total2);

        // O valor inicial é passado apenas na primeira chamada
        Integer total3 = nums.stream().reduce(100, soma);
        System.out.println(total3);

        // Filtra os valores que sao maiores que 5 e faz uso desses valores na função lambda
        nums.stream().filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
