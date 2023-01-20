package dio.cassio.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        
        int totalRespostasSim = InvestigarPessoa();

        // Switch case para ver onde a pessoa se enquadra.
        // Caso nao seja suspeita, cumplice ou assassina é sempre inocente
        switch(totalRespostasSim){
        case 2:
            System.out.println("Suspeita.");
            break;
        case 3:
        case 4:
            System.out.println("Cúmplice.");
            break;
        case 5:
            System.out.println("Assassina.");
            break;
        default:
            System.out.println("Inocente.");
        }
        
    }

    public static int InvestigarPessoa(){
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> perguntas = new ArrayList<>();

        // dados vai receber o scanner do q o usuario digitar
        // respostas vai contar quantos "sim" ele respondeu
        String dados;
        int respostas = 0;

        // preenchendo a lista de perguntas
        perguntas.add("Telefonou para a vítma? ");
        perguntas.add("Esteve no local do crime? ");
        perguntas.add("Mora perto da vítma?");
        perguntas.add("Devia para a vítma? ");
        perguntas.add("Já trabalhou com a vítma? ");

        System.out.println("Responda sim ou não.");

        // Fazendo cada uma das perguntas da lista, e contabilizando os "sim"
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            dados = scanner.next();

            if(dados.equals("sim")) respostas++;
        }

        return respostas;
   
    }
}
