package lambdas.exercicios;

public class Exec03 {
    public static void main(String[] args) {
        // Use lambdas para criar e iniciar uma thread que imprime os números de 1 a 10.

        Thread t1 = new Thread(() -> {
            for (int i = 1; i<=10;i++){
                System.out.println(i);
            }
        });
        t1.start();
    }
}
