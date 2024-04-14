# 📌 Generics
Nessa pasta contém os meus estudos sobre o generics, como pode ser usado e suas diferenças.

# 📌 Métodos Genéricos:
- O compilador garatirá a correção do tipo de qualquer tipo que usarmos
- Podemos utilizar diferetes tipos.

```java
// Aqui estou informando que o retorno do metodo será do mesmo tipo da lista passada como argumento
// Onde ela irá retornar o ultimo valor da lista

public <T> T getLista(List<T> lista){
    return lista.get(lista.size()-1);
}
```

# 📌 Classes Genéricas:
- A implementação é parecida com uma classe genérica, porém contém uma seção para o parâmetro do tipo
- Pode conter mais de 1 parametro de tipo, são separados por virgula
```java
// Estamos criando uma classe onde passaremos o tipo do generics em sua criação
public class Caixa<T>{
    private T valor;

    public T getValor(){
        return valor;
    }
}

public class CaixaTeste {
    public static void main(String[] args) {
        // Instanciando a classe Caixa passando o seu tipo(String)
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        // Instanciando uma nova caixa com tipo Double
        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(2.3);
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
```

# 📌 Usando Herança:
- Com o Uso de herança podemos criar uma classe com generics com restrições do tipo que poderá ser definido ou herdar algo com um tipo pre-definido.
```java
// Criando a classe caixa com generics
public class Caixa<T>{
    private T valor;

    public T getValor(){
        return valor;
    }
}

// Informando que a classe CaixaNumber so poderá ser definido com algum tipo numerico
// Com essa restrição, ele não podera ser instanciando com o tipo String por exemplo
public class CaixaNumero<N extends Number> extends Caixa<N>{
}
```

# 📌 Utilizando mais de 1 parametro:
- Como foi dito anteriormente podemos criar uma classe ou metodo com mais de 1 parametro generic
- Podemos utilizar mais de 1 parametro para definição do tipo de entrada e do tipo saida, para definir o tipo das 2 entradas, entre outros.
- Alguns Usos:
  1. Um dos usos de mais de 1 parametro é no HashMap, onde temos que especificar o tipo do valor e da key
    ```java
    public class Main{
        public static void main(String[] args) {
            // Criando o hash para armazenar uma pessoa, com nome e sua respectiva idade
            // Informamos que a chave será do tipo String e o valor do tipo Integer
            HashMap<String, Integer> pessoa = new HashMap<>();
            pessoa.put("Joao", 20);
        }
    }
    ```
  2. Outro uso poderia ser a utilização para especificar os 2 tipos de entradas e o de saida em um metodo. Podemos ver esse uso na lambda expression BiFunction
  ```java
    public class Main{
        public static void main(String[] args) {
                // Criamos uma lambda que recebe 3 parametros, os 2 primeiros o tipo de entrada, e o 3 o tipo de saida
                BiFunction<Integer, Integer, String> somaEscrita = (num1, num2) -> {
                int resultado = num1 + num2;
                return String.format("A soma dos valores resultou em -> %d", resultado);
            };
  
            System.out.println(somaEscrita(1,2)); // imprimi "A soma dos valores resultou em -> 3"
        }
    }
    ```
