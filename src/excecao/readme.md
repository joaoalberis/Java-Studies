# Tratamento de erros
Nessa pasta contém meus estudos sobre o tratamento de erros, em seu conteúdo a criação de exceções personalidas tanto não verificadas, como verificadas.

# 📌Tipos de erros:
### 1. Error em tempo de compilação:
-  Impedi o processo natural da criação do codigo-fonte(.java) para bytecode(.class)
- Ocorre quando o codigo viola alguma regra da linguagem java(sintaxe)
- È identificado pelo programa durante sua compilação, antes da execução do programa.

### 2. Error em tempo de execução:
- são erros que ocorrem durante a execução do programa
- È causada por uma operação ilegal durante a execução do programa, como tentantiva de acessar um index invalido ou divisão por 0, entre outros...
- Representado pela classe Throwable, que contém 2 subclasses: Error e Exception
    1. Error:
        - São erros mais graves, capturados durante a execução do programa
        - Em sua grande maioria, esse tipo de error não pode ser lidados, como falta de memoria.
    2. Exception:
       - São erros excepcionais, onde o programa captura
       - Podendo ser uma exceção verificada, onde o programa deve tratar ou uma exceção não verificada onde não obrigatorio o tratamento


# 📌 Exceções Checadas e Não Checadas
### 1. Checadas:
- Precisa ser declarada com o throws.
- Caso ocorra, o bloco responsavel precisa ser tratado com o try/catch ou o metodo precisa conter a assinatura da clasula throws para especificar o error.
- Geralmente é a classe Exception e suas subclasses, exceto RuntimeException e suas subclasses.

### 2. Não Checadas:
- Não precisa ser declarada com o throws.
- Não é obrigatório o tratamento da exceção.
- Geralmente é a classe RuntimeException e suas subclasses

# 📌Try/Catch:
- Usando para o tratamento de erros que são lançados.
- o Bloco try corresponde a parte do codigo que o programa tentará executar.
- No bloco catch tratamos o error com uma exception mais generica ou mais especifica, o bloco de codigo será executado caso a exceção tratada seja lançada.
```java
// Tratamento de uma exceção de forma mais generica
// entrara no catch com qualquer error lançado em tempo de execução.
try {
    int valor = 7 / 0;
    System.out.println(valor);
}catch (Exception e) {
    System.out.println("Ocorreu um error");
}
```
```java
// Tratamento de uma exceção de forma mais especifica, so entrara no catch
// caso a exceção lançada seja um ArithmeticException.
try {
    int valor = 7 / 0;
    System.out.println(valor);
}catch (ArithmeticException e) {
    System.out.println("O programa teve um problema de exceção aritmetica.");
}
```
# 📌 Finally:
- Faz parte do try/catch, porem não obrigatorio o uso
- Responsavel por executar algo ao final da finalização do try/catch, independente de ter tido uma exceção lançada ou não
```java
// Embora não seja lançado nenhuma exceção no codigo
// ao final sera imprimido o System.out.println do finally.
try {
    int valor = 7 / 7;
    System.out.println(valor);
}catch (ArithmeticException e) {
    System.out.println("O programa teve um problema de exceção aritmetica.");
}finally{
    System.out.println("O bloco try/catch finalizou!");    
}
```

# 📌 Exceções Personalizadas:
- È possivel a criação de exceções personalizadas para casos de usos diferentes
- Para lançar uma exceção personalizada podemos utilizar ```throw new StringVaziaException("nome")```
- A palavra-chave throw é responsavel por informar que estamos lançado a exceção
```java
// Esse exception será responsavel por ser lançado, caso tenha uma string vazia
public class StringVaziaException extends RuntimeException{

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){ // metodo responsavel por pegar a mensagem do error
        return String.format("O atributo %s está vazio", this.nomeDoAtributo);
    }
}
```