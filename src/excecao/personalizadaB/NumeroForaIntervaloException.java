package excecao.personalizadaB;

// Criando uma exception personalizada do tipo checada
// Esse exception será responsavel por ser lançado, caso tenha um numero negativo
public class NumeroForaIntervaloException extends Exception{

    private final String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está fora do intervalo", this.nomeDoAtributo);
    }
}
