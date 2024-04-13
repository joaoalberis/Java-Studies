package lambdas.Funcionais;

import java.util.function.Function;

//Function, Recebe um tipo como argumento e retorna o mesmo tipo ou outro.
//Nesse uso, Recebemos um Inteiro como argumento e retornamos uma String
public class Functions {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        // Primeiro ele aplica a logica do apply, apos aplicada, ele então executa a função oResultadoE
        // Podemos chamar isso de encadear funções, consiste em chamar varias funções, onde podemos reutilziar funções para outras coisas até obter o resultado desejado
        String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32);
        System.out.println(resultadoFinal);

        Function<String, String> empolgado = valor -> valor + ",Gostei do resultado";

        // O Encadeamento é feito da esquerda para a direita, apos o apply ser resolvido, os andThen serão chamados da esquerda para direita
        String finalResult = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
        System.out.println(finalResult);

    }
}
