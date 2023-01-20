package dio.cassio.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArcoIris {
    public static <T> void main(String[] args) {
        HashSet<String> cores = new HashSet<String>();
        cores.add("vermelho");
        cores.add("laranja");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("azul");
        cores.add("azul-escuro");
        cores.add("violeta");
        
        // Exiba as cores uma embaixo da outra
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Exiba a quantidade de cores que o arco iris tem
        System.out.println("O arco-íris tem: "+ cores.size() + " cores.");

        // Ordem alfabética
        // Transformando o set em lista e ordenando a lista
        List<String> ordemAlfabetica = new ArrayList<>(cores);
        Collections.sort(ordemAlfabetica);
        System.out.println(ordemAlfabetica);

        // Exibindo cores com V 
        System.out.println("Cores com a letra V");
        for (String cor : cores) {
            if(cor.charAt(0) == 'v'){
                System.out.println(cor);
            }
        }

        // Limpando o set
        System.out.println("Limpando o set");
        cores.clear();
        System.out.println(cores);
        
    }
}
