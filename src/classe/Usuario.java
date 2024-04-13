package classe;

public class Usuario {

    String nome;
    String email;

    //Configurando o equals para verificar se o objeto é igual a outro, levando em consideração o nome e email;
    //Por padrao o equal compara a referencia dos objetos
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario){
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        return false;
    }
}
