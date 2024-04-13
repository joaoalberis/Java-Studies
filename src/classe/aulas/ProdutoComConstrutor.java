package classe.aulas;

public class ProdutoComConstrutor {

    String nome;
    double preco;
    double desconto;

    ProdutoComConstrutor(){

    }

    ProdutoComConstrutor(String nomeInicial){
        nome = nomeInicial;
    }

    ProdutoComConstrutor(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    ProdutoComConstrutor(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }

}
