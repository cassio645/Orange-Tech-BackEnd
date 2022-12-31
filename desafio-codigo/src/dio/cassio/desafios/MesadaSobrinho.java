package dio.cassio.desafios;
import java.util.Scanner;

/**
 * Classe criada para calcular a quantidade de dinheiro que o sobrinho terá em x mêses.
 */

public class MesadaSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        System.out.println(calculaMesada(mesada, entrada));
        
    }
    public static int calculaMesada(int mesada, int meses) {
        int total = mesada * meses;
        return total;
    }
    
}
