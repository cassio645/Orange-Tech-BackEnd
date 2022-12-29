package dio.cassio.exerciciosarray;
import java.util.Scanner;

/*Crie um vetor de 6 números inteiros e mostre a ordem inversa */

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {11, 12, 13, 14, 15, 16};
        int count = vetor.length-1;

        while (count >=0){
            System.out.print(vetor[count] + " ");
            count--;
        }
    }
}
