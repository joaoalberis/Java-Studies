package lambdas.Funcionais;

import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
        System.out.println(isPar.test(122));
        System.out.println(isTresDigitos.test(90));

        // Composição de Predicates, os 2 valores tem que dar true
        System.out.println(isPar.and(isTresDigitos).test(92));

        // Negar o teste
        System.out.println(isPar.negate().test(122));

        // Composição de Predicates, um valor ou outro tem que ser true
        System.out.println(isPar.or(isTresDigitos).test(92));
    }
}
