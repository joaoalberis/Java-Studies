package classe;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "João Silva";
        u1.email = "joao.silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "João Silva";
        u2.email = "joao.silva@ezemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
