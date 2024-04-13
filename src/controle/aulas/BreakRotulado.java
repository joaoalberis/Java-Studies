package controle.aulas;

public class BreakRotulado {

    public static void main(String[] args) {

        // Rotulando o for é possivel especificar de qual for ele ira sair.
        externo: for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                if (i == 1){
                    break externo;
                }

                System.out.printf("%d %d ", i, j);
            }
            System.out.println();
        }
    }

}
