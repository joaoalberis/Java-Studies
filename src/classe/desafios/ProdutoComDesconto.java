package classe.desafios;

public class ProdutoComDesconto {
    String nome;
    double preco;
    static double desconto = 0.25;

    ProdutoComDesconto(){

    }

    ProdutoComDesconto(String nomeInicial){
        nome = nomeInicial;
    }

    ProdutoComDesconto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
