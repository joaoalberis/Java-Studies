package lambdas.Funcionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//BinaryOperator, Recebe 2 tipo generico(iguais) como argumento e retorna o mesmo tipo.
//Nesse uso, Recebemos 2 Doubles como argumento e retornamos um Double
public class BinaryOperators {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        // Interface binaria mais completa, onde é parecida com o binaryoperator, porem é possivel especificar o tipo de retorno
        // Ele recebe 2 tipos de entrada e um tipo para saida
        // Nesse caso recebemos 2 valores doubles e retornamos uma string
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 5.1));
    }
}
