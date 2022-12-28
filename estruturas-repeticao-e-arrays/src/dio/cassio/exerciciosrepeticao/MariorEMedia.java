package dio.cassio.exerciciosrepeticao;
import java.util.Scanner;

/*
 * Faça um programa que leia 5 números.
 * e ifnrome o maior número.
 * e a média desses números.
 */

public class MariorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, media;
        int count = 0;
        int total = 0;
        int maiorNumero = 0;

        do{
            System.out.print("Número: ");
            numero = scan.nextInt();

            // somando o número digitado naquela vez ao total
            total += numero;

            // adicionando +1 ao contador
            count++;

            // Se for a primeira vez passando no laço
            // atribua a variavel maiorNumero o valor do numero
            // caso contrario compare se o valor do numero é maior que o da variavel maiorNumero
            // caso seja altere o valor de maiorNumero 
            if (count == 1){
                maiorNumero = numero;
                
            }else{ 
                if (maiorNumero < numero){
                    maiorNumero = numero;    
                }
            }
        
        // repita enquanto count for menor que 5
        }while(count < 5);

        // calculando a média
        media = total/5;
        
        System.out.println("O maior número digitado foi o " + maiorNumero);
        System.out.println("A média dos valores foi: "+ media);
}}
