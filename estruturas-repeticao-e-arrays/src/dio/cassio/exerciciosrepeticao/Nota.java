package dio.cassio.exerciciosrepeticao;
import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja valido e continue pedindo
 * até que o usuário informe um valor valido.
 */

public class Nota {
    public static void main(String[] args) {
        // Criando Scanner para receber dados do teclado
        Scanner scanner = new Scanner(System.in);

        int nota;
        System.out.print("Digite o valor da nota: ");
        nota = scanner.nextInt();

        // enquanto a nota digitada for menor q 0 OU  for maior q 10, continue pedindo para digitar
        while (nota < 0 || nota > 10){
            
            System.out.println("Nota invalida!! Digite novamente.");
            System.out.print("Nota: ");
            nota = scanner.nextInt();
        }

        System.out.println("Nota digitada " + nota);

    }
    
}
