package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // Utilizando uma interface funcional, definida pelo proprio java da biblioteca java.lang

        BinaryOperator<Double> calc = (x, y) ->  x + y;
        System.out.println(calc.apply(2.0,3.0));

        calc = (x, y) ->  x * y;
        System.out.println(calc.apply(2.0,3.0));
    }
}
