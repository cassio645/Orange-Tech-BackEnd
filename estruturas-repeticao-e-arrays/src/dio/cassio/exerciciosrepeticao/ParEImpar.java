package dio.cassio.exerciciosrepeticao;
import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalNumeros, numero;
        int i = 1;
        int par = 0, impar = 0;

        System.out.print("Quantos números você quer informar? ");
        totalNumeros = scan.nextInt();

        while (i <= totalNumeros){
            System.out.print(i + "º número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) par++;
            else impar++;

            i++;
        }
        System.out.println("Você digitou " + par +" números pares e "+ impar + " números impares.");
    }
}
