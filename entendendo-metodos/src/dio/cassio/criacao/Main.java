package dio.cassio.criacao;
/**
 * Classe principal dos exercícios da aula 1 de metodos.
 */

public class Main {
    public static void main(String[] args) {
        
        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.somar(3, 6);
        Calculadora.subtrair(10, 3);
        Calculadora.multiplicar(8, 7);
        Calculadora.dividir(200, 4);

        System.out.println("-------------//-------------");

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(18);

        // Emprestimo
        System.out.println("Exercício emprestimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(2450, 3);
        Emprestimo.calcular(1500, 8);
    }
}
