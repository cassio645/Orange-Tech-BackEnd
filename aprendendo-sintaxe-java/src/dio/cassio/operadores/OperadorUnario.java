package dio.cassio.operadores;

public class OperadorUnario {
    public static void main(String[] args) {
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        // A forma de passar para positivo um numero negativo é multiplicando por -1
        numero = numero * -1;
        System.out.println(numero);
    }
    
}
