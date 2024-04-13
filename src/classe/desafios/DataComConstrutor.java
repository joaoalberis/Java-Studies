package classe.desafios;

public class DataComConstrutor {

    public int dia;
    public String mes;
    public int ano;

    DataComConstrutor(){
        dia = 01;
        mes = "Janeiro";
        ano = 1970;
    }

    public DataComConstrutor(int diaInicial, String mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    public String obterDataFormatada(){
        return dia+"/"+mes+"/"+ano;
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

}
