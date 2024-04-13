package lambdas.Funcionais;

// Predicate, recebe um tipo como argumento e retorna um boolean(true ou false)
// Nesse caso, predicate recebeu um Produto como tipo e esta verificando se o produto tem um valor superior ou igual a 750.
public class Predicates {
    public static void main(String[] args) {
        java.util.function.Predicate<Produto> isCaro = prod -> prod.preco >= 750;
        Produto produto = new Produto("Notebook", 3893.89, 85);
        System.out.println(isCaro.test(produto));

        isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        System.out.println(isCaro.test(produto));
    }

}
