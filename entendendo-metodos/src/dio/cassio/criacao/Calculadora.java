package dio.cassio.criacao;

/**
 * Classe de exemplo para o exercício da aula 1 de métodos.
 */

public class Calculadora {

    /**
     * Este método é utilizado para somar dois números 
     * @param numero1
     * @param numero2
     * @void Mostra o resultado da soma
     */
    public static void somar(double numero1, double numero2){

        double resultado = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    }

    /**
     * Este método é utilizado para subtrair dois números 
     * @param numero1
     * @param numero2
     * @void Mostra o resultado da subtração     */
    public static void subtrair(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + resultado);
    }

    /**
     * Este método é utilizado para multiplicar dois números 
     * @param numero1
     * @param numero2
     * @void Mostra o resultado da multiplicação
     */
    public static void multiplicar(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println(numero1 + " x " + numero2 + " = " + resultado);
    }

        /**
     * Este método é utilizado para dividir dois números 
     * @param numero1
     * @param numero2
     * @void Mostra o resultado da divisão
     */
    public static void dividir(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + resultado);
    }
    
}
