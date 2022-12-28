package dio.cassio.exerciciosrepeticao;

import java.util.Scanner;
/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo
 * representando sua idade. (Para inserindo o valor 0 no campo do nome)
 */

public class NomeEIdade {
    public static void main(String[] args) {
        // Criando objeto scanner para receber dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Declarando as variaveis
        String nome;
        int idade;

        while (true){
            System.out.print("Digite seu nome: ");
            nome = scanner.next();

            if (nome.equals("0")) break;

            System.out.println();
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

        }

        System.out.println("Finalizando...");
        

    }
    
}
