package dio.cassio.exerciciosarray;
import java.util.Scanner;
/*
 * Faça um vetor que LEIA 6 caracteres,
 * e diga quantoas consoantes foram lidas.
 * Imprima as consoantes
 */

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letras = new String[6];
        int consoantes = 0, i=0;

        do {
            System.out.print("Letra: ");
            String valor = scan.next();

            if (!(valor.equalsIgnoreCase("a") || 
                valor.equalsIgnoreCase("e") || 
                valor.equalsIgnoreCase("i") || 
                valor.equalsIgnoreCase("o") || 
                valor.equalsIgnoreCase("u")) ){
                    letras[i] = valor;
                    consoantes++;
                }        
            i++;

        }while(i < letras.length);

        System.out.println("Voce digitou " + consoantes + " consoantes");
        for (String letra : letras) {
            if (letra != null) System.out.print(letra + " ");
        }
    }
}
