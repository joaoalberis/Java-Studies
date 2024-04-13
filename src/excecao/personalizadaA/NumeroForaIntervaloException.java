package excecao.personalizadaA;

// Criando uma exception personalizada do tipo não checada
// Esse exception será responsavel por ser lançado, caso tenha um numero fora do intervalo
public class NumeroForaIntervaloException extends RuntimeException{

    private final String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está fora do intervalo", this.nomeDoAtributo);
    }
}
