package excecao;

public class Basico {
    public static void main(String[] args) {

        // imprimirNomeDoAluno(a1); -> Gera um error NullPointerException, pois esta tentando acessar um atributo de algo null.

        // System.out.println(7/0); -> Gera uma exceção ArithmeticException, pois não é possivel dividir por 0

        Aluno a1 = null;

        // tratamento do error, caso ocorra um error, será enviado a mensagem que esta dentro do catch
        try {
            imprimirNomeDoAluno(a1);
        }catch (Exception excecao){ // Forma mais generica de tratar um error, pois engloba todos os erros em geral
            System.out.println("Ocorreu um error no momento de imprimir o nome do usuario!");
        }

        try {
            System.out.println(7/0);
        }catch (ArithmeticException excecao){ // Forma de tratamento mais especifica, ele ira tratar um error de arithmetica, por exemplo, uma divisao por 0
            System.out.println("Ocorreu o error: " + excecao.getMessage());
        }
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
