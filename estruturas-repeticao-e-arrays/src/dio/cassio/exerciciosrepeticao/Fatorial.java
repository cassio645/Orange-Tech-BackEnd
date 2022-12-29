package dio.cassio.exerciciosrepeticao;
import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 1, numero = 0;

        System.out.print("Número: ");
        numero = scan.nextInt();

        for (int i = numero; i>= 1; i--){
            total *= i;
        }
        System.out.println(total);
    }
}
