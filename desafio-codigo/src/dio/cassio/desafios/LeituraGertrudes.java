package dio.cassio.desafios;
import java.util.Scanner;

/**
 * Classe criada para calcular a quantidade de dias necessários para se acabar um livro
 * baseado na quantidade de páginas lidas por dia.
 */
public class LeituraGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        int quantidadeDias = calculaTotalDias(paginas, paginasLidas);
        System.out.println(quantidadeDias + " dias");
    }

    public static int calculaTotalDias(int totalPaginas, int paginasLidas){
        int totalDias = totalPaginas / paginasLidas;
        return totalDias;
    }
}
