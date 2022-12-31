package dio.cassio.desafios;
import java.util.Scanner;

/**
 * Classe criada para criar uma barra de download(porcentagem baixada) a partir de um número inteiro.
 */
public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        barraDownload(tamanho);
    }

    public static void barraDownload(int valor){
        int i = 0;

        while (i < valor){
            System.out.print("/");
            i++;
        }
    }
}
