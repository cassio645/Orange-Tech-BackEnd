package dio.cassio.exerciciosrepeticao;
import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número entre 1 e 10.
 * O usuário deve informar qual número ele deseja ver a tabuada.
 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroTabuada;

        System.out.print("Número: ");
        numeroTabuada = scan.nextInt();

        System.out.println("Tabuada do " + numeroTabuada);
        
        for (int i = 1; i <= 10; i++){
            System.out.println(numeroTabuada + " x " + i + " = " + numeroTabuada*i);
        }
    }
}
