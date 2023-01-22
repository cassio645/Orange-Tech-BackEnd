package dio.cassio.desafios;

import java.util.Scanner;

/**
 *  Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
 */
public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");

        for (String ingrediente : listaIngredientes) {
            System.out.println(ingrediente);
        }
    }
}
