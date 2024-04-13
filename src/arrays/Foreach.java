package arrays;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        // pecorrendo todo o array com um for padrao
        for (int i = 0; i <notas.length;i++){
            System.out.println(notas[i]);
        }

        // pecorrendo o array com o Foreach
        for (double nota : notas){
            System.out.println(nota);
        }
    }
}
