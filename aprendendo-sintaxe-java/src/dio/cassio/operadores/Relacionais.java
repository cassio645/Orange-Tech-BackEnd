package dio.cassio.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        System.out.print(numero1 + " é igual a "+ numero2 + "? ");
        System.out.println(numero1 == numero2);
        System.out.print(numero1 + " é diferente de "+ numero2 + "? ");
        System.out.println(numero1 != numero2);

        System.out.print(numero1 + " é maior que "+ numero2 + "? ");
        System.out.println(numero1 > numero2);

        if (numero1 < numero2){
            System.out.println(numero1 + " é menor que " + numero2);
        }

        // Comparando strings
        String nome1 = "Cássio";
        String nome2 = "Cássio";
        System.out.println(nome1 == nome2);

        nome2 = new String("Cássio");
        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));
    }
}
