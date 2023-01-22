package dio.cassio.desafios;

import java.util.Scanner;

/**
 * Classe criada para verificar se a pessoa esta acima de 80km/h 
 * EEE se possui 3 multas ou mais.
 */

public class PontosCarteira {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        if (velocidade > 80){
            ++multas;
            if (multas >= 3) System.out.println(multas + " multas. Levou pontos na carteira");
            else System.out.println(multas + " multas. Nao levou pontos na carteira");

        }else{
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
    }
}
