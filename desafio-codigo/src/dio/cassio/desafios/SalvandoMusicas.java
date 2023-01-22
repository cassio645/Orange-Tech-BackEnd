package dio.cassio.desafios;

import java.util.Scanner;

/**
 * Classe criada apagar todos arquivos que não sejam  .mp3
 */
public class SalvandoMusicas{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        if (arquivoDoPc.contains(".mp3")) System.out.println("Salvar");
        else System.out.println("Deletar");

    }
}