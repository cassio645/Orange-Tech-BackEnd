package dio.cassio.desafios;

import java.util.Scanner;

/**Classe criada para remover as barras da String e apresentar de forma mais amigável
 */


public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = frase.split("/");
        
        System.out.println("Imovel: "+array[0]+ " R$"+ array[1]+ " "+ array[2]);
       
    }
}
