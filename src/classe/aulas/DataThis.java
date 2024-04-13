package classe.aulas;

public class DataThis {

    // This pode ser usado para referenciar o objeto atual;

    public int dia;
    public String mes;
    public int ano;

    DataThis(){
        //dia = 01;
        //mes = "Janeiro";
        //ano = 1970;
        // Permiti chamar outro construtor a partir de um construtor;
        this(1, "Janeiro", 1970);
    }

    DataThis(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){
        return dia+"/"+mes+"/"+ano;
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
