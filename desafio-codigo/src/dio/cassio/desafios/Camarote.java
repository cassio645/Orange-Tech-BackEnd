package dio.cassio.desafios;

import java.util.Scanner;

/**
 * Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares
 */
public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        if (tamanhoDaFila%2 == 0){
            pessoasNoCamarote = tamanhoDaFila/2;
            System.out.println(pessoasNoCamarote + " pessoas no camarote");
        }
        else{
            pessoasNoCamarote = ++tamanhoDaFila/2;
            System.out.println(pessoasNoCamarote + " pessoas no camarote");
        }
    }
}
