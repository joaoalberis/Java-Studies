package lambdas.Funcionais;

import java.util.function.UnaryOperator;

//UnaryOperator, Recebe um tipo generico como argumento e retorna o mesmo tipo.
//Nesse uso, Recebemos um Inteiro como argumento e retornamos um inteiro
public class UnaryOperators {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        // Encadeamento, primeiro ele executa a interface maisDois, apois isso executa o encadeamento da esquerda para direita(vezesDois e aoQuadrado)
        // 0 + 2 -> 2 * 2 -> 4 * 4 = 16;
        int resultado1 = maisDois.andThen(vezesDois)
                        .andThen(aoQuadrado)
                                .apply(0);
        System.out.println(resultado1);

        // Composição ao contrario do andThen, primeiro ele aplicada o valor a interface maisDois, e vai indo executando o restante da direita para esquerda(vezesDois e aoQuadrado)
        // 0 + 2 -> 2 * 2 -> 4 * 4 = 16
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
    }
}
