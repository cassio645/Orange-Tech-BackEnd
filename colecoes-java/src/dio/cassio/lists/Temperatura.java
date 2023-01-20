package dio.cassio.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        double dados;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 6 temperaturas: ");
        

        // Lista de temperaturas
        List<Double> temperaturas = new ArrayList<>();

        // Preenchendo a lista com 6 temperaturas
        for(int i=0; i<6; i++){
            System.out.println("Digite a "+ (i+1));
            dados = scanner.nextDouble();
            temperaturas.add(dados);

        }
        // Mostrando os dados coletados
        System.out.print("As temperaturas são: ");
        System.out.println(temperaturas);

        // Calculando a média de temperatura
        double media = Mean(temperaturas);
        System.out.println("A média das temperaturas é: "+ media);

        // Funcao que mostra os meses com temperaturas acima da media
        AcimaDaMedia(media, temperaturas);


    }
    
    public static double Mean(List<Double> temperaturas){
        // Calculando a média de temperatura
        double soma = 0;
        for (Double temp : temperaturas) {
            soma += temp;    
        }
        return soma/temperaturas.size();
    }

    public static void AcimaDaMedia(Double media, List<Double> temperaturas){
        // Array simples com os primeiros meses do ano
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        
        System.out.println("Meses com temperatura acima da média: ");
        
        // Verificando onde tempos temperaturas acima da media e mostrando o número do mes, e nome dele.
        for(int i=0; i<temperaturas.size(); i++){

            if(temperaturas.get(i)> media){
                System.out.println((i+1) + " - "+ meses[i]);
            }
        }
    }
}

