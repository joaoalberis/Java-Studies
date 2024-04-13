package classe.desafios;

public class DataRefatorado {

    int dia;
    String mes;
    int ano;

    String obterDataFormatada(){
        return dia+"/"+mes+"/"+ano;
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
