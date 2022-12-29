package dio.cassio.exerciciosarray;
import java.util.Random;
/*
 * Faça um programa que leia 20 números aleatorios entre (0 e 100) armazene em um vetor.
 * Ao final mostre os números e seus sucessores.
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[20];

        for(int i = 0; i < 20; i++){
            int randint = random.nextInt(100);
            vetor[i] = randint;
            System.out.print(randint + " ");

        }
        System.out.println("\nSucessores");
        for (int i : vetor) {
            System.out.print(i+1 + " ");
        }

    }
}
