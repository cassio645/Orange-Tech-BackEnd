package dio.cassio.desafios;
import java.util.Scanner;

/**Classe criada para verificar se o motorista está acima do limite de velocidade
 * e receberá uma multa.
 */
public class IndustriaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        verificaMulta(velocidadeAtual);
    }

    public static void verificaMulta(int velocidade){
        if (velocidade > 60) System.out.println("Foi multado");
        else System.out.println("Nao foi multado");
    }
}
