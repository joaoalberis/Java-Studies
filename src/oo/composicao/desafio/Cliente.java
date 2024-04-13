package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    final String nome;
    // relação 1 para muitos com compras
    final ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompras(Compra compra){
        compras.add(compra);
    }

    double obterValorTotal(){
        double total = 0;
        for (Compra compra : compras){
            for (Item item : compra.items){
                double preco = item.produto.preco;
                double quantidade = item.quantidade;
                total += preco * quantidade;
            }
        }
        return total;
    }
}
