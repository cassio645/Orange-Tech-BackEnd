package dio.cassio.maps;

import java.util.HashMap;

/** Criar um PRograma que simule um dado lançado 100x
 * Depois armazene a quantidade de vezes que cada valor foi inserido
 */
public class Dado {
    public static void main(String[] args) {

        // HashMap para armazenar o número de vezes que foi lançado como key: e o valor q saiu no dado como value
        HashMap<Integer, Integer> dadosDoDado = new HashMap<Integer, Integer>();
        
        // for preenchendo o hashmap
        for(int i=0; i< 100; i++){

            // Gerar numero random de 1 a 6
            int valor = (int)(Math.random()*(6)+1); 
            dadosDoDado.put(i, valor);
        }

        // Outro hashmap com os valores do dado como key: e a quantidade de vezes que cada valor saiu como value
        HashMap<Integer, Integer> quantidadeValores = new HashMap<Integer, Integer>();
        quantidadeValores.put(1, 0);
        quantidadeValores.put(2, 0);
        quantidadeValores.put(3, 0);
        quantidadeValores.put(4, 0);
        quantidadeValores.put(5, 0);
        quantidadeValores.put(6, 0);

        
        for (Integer i : dadosDoDado.values()) {
            Integer valor = quantidadeValores.get(i);
            valor++;
            quantidadeValores.put(i, valor);
          }
        
        System.out.println(quantidadeValores);

    }
}
