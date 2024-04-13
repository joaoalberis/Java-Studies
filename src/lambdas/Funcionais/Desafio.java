package lambdas.Funcionais;

import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        /*
        1. A partir do produto calcular o preco real (com desconto)
        2. Imposto municipal: >= 2500 (8,5%) / < 2500 (Isento)
        3. Frete: >= 3000 (100) / < 3000 (50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: R$1234,56
         */
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> precoReal = valor -> valor.preco * (1 - valor.desconto);
        UnaryOperator<Double> precoComImposto = valor -> valor >= 2500 ? valor * (1 + 8.5 / 100) : valor;
        UnaryOperator<Double> precoComFrete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
        UnaryOperator<Double> arredondar = valor -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", valor));
        Function<Double, String> formatado = valor -> ("R$"+valor).replace(".", ",");
        String resultado = precoReal.andThen(precoComImposto).andThen(precoComFrete).andThen(arredondar).andThen(formatado).apply(p);
        System.out.println("O preço final é " + resultado);


    }
}
