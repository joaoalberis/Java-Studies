package oo.composicao.desafio;

public class Item {

    // Relação muitos para 1 com produto
    final Produto produto;
    final int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

}
