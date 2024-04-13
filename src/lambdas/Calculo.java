package lambdas;

// Indica que essa será uma interface funcional, ou seja, terá apenas um metodo abstrato
// Indica também que essa interface é projetada para ser usada com uma expressão lambda
@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);


    // Embora esta anotado com a anotação @FunctionalInterface, não haverá problemas, pois para utilização na expressão lambda
    // o java irá reconhecer o unico metodo abstract
    default String legal(){
        return "legal";
    }

    static String muitoLegal(){
        return "muito legal";
    }

}
