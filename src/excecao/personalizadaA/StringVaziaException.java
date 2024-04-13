package excecao.personalizadaA;

// Criando uma exception personalizada do tipo não checada
// Esse exception será responsavel por ser lançado, caso tenha uma string vazia
public class StringVaziaException extends RuntimeException{

    private final String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está vazio", this.nomeDoAtributo);
    }


}
