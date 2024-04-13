package streamapi.filter;

public class Produto {
    final double preco;
    final String nome;
    final double desconto;
    final double frete;

    public Produto(double preco, String nome, double desconto, double frete) {
        this.preco = preco;
        this.nome = nome;
        this.desconto = desconto;
        this.frete = frete;
    }
}
