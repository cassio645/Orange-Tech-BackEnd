package dio.cassio.operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        // tipo variavel = operacao ternaria ? valorTrue : valorFalse;
        String resultado = a==b ? "verdadeiro":"falso";

        System.out.println(resultado); // falso
    }
}
