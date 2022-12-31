package dio.cassio.desafios;
import java.util.Scanner; 

/**
 * Classe criada para calcular a quantidade de doces cada cliente irá receber.
 */
public class LojinhaDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();

        calculaTotalDoces(dinheiro);
    }

    public static void calculaTotalDoces(int valor){
        System.out.println("O cliente obteve "+ (valor*2) + " doces");
    }
}
