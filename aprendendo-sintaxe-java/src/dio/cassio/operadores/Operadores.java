package dio.cassio.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        double soma = 10 + 17; // 27
        int subtração = 113 - 25; // 88
        int multiplicacao = 20*7; // 140
        int divisao = 15/3; // 5
        int modulo = 18%3; // 0
        double resultado = (10 * 7) + (20 / 4); // 75


        // testando com debug
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1"+ (1+1+1);
        System.out.println(concatenacao);
        
    }
}
