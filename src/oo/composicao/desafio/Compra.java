package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    // Relação 1 para muitos com items
    final ArrayList<Item> items = new ArrayList<>();

    void adicionarItem(Item item){
        items.add(item);
    }

}
