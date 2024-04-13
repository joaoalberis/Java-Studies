package streamapi.map;

import java.util.function.UnaryOperator;

public class Utilitarios {

    final static UnaryOperator<String> maiscula = n -> n.toUpperCase();


    static String grito(String n){
        return n + "!!!";
    }
}
