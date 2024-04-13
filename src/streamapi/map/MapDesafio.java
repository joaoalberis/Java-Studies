package streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDesafio {
    public static void main(String[] args) {
        /*
        1. Número para string binária... 6 => "110"
        2. Inverter a string... "110" => "011"
        3. Converter de volta para inteiro => "011" => 3
         */

        UnaryOperator<String> invertString = v -> new StringBuilder(v).reverse().toString();
        Function<String, Integer> convertBinary = s -> Integer.parseInt(s, 2);


        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(invertString)
                .map(convertBinary)
                .forEach(System.out::println);

    }
}
