package dio.cassio.exerciciosarray;
import java.util.Random;

/*Gere e imprima uma matriz de ordem 4 com valores aleatorios entre 0 e 9 */

public class Multidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] matriz = new int[4][4];

        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int numero = random.nextInt(10);
                matriz[i][j] = numero;
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}
