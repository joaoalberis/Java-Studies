package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("", -7);
            Validar.aluno(aluno); // gera uma exceção, pois o aluno foi criado com um nome vazio
        }catch (StringVaziaException e){ // Tratando caso o nome esteja vazio
            System.out.println(e.getMessage());
        }catch (NumeroForaIntervaloException e){ // Tratando caso a nota não esteja no intervalo(entre 0 e 10)
            System.out.println(e.getMessage());
        }



    }
}
