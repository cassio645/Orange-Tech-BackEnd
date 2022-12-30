package dio.cassio.retornos;
/**
 * Classe de exemplo para o exercício da aula 3 de métodos.
 */

public class Quadrilatero {
    public static double area(double lado){
        return (lado * lado);
    }

    public static double area(double lado1, double lado2){
        return (lado1 * lado2);
    }
    public static double area(double baseMaior, double baseMenor, double altura){
       return ((baseMaior + baseMenor)* altura) / 2;
    }
}
