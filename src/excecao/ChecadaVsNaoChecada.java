package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) throws Exception {
        geraErro1();
        geraErro2();
    }

    // Exceção Não checada ou não verificada
    // Esse tipo de exceção não é necessario ser feita o tratamento de error
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um error #01!"); // Necessario throw para lançar o error
    }

    // Exceção checada ou verificada
    // Esse tipo de exceção precisa ser tratada
    // Pode ser tratada no proprio bloco, ou apenas assinar o metodo para indicar que ele precisa ser tratado
    static void geraErro2() throws Exception { // assinando o metodo
        try {
            throw new Exception("Ocorreu um error #02");
        } catch (Exception e) {
            System.out.println("Foi tratada");
        }

    }
}
