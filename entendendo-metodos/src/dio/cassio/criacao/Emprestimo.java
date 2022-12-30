package dio.cassio.criacao;
/**
 * Classe de exemplo para o exercício da aula 1 de métodos.
 */

public class Emprestimo {

    /**
     * Este método retorna o valor da taxa para emprestimos de 2 parcelas 
     * @return Taxa para 2 parcelas
     */
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    /**
     * Este método retorna o valor da taxa para emprestimos de 3 parcelas 
     * @return Taxa para 3 parcelas
     */
    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    /**
     * Este método calcula o valor total do emprestimo com base no valor e número de parcelas
     * @param valor
     * @param parcelas
     * @void Mostra o total calculado
     */
    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double total = valor + (valor * getTaxaDuasParcelas());

            System.out.println("O valor final para o emprestimo de 2 parcelas é de: R$ " + total);

        }else if (parcelas == 3){
            double total = valor + (valor * getTaxaTresParcelas());

            System.out.println("O valor final para o emprestimo de 3 parcelas é de: R$ " + total);

        }else{
            System.out.println("Quantidade de parcelas inválida. Trabalhamos apenas com 2 e 3 parcelas.");
        }
    }
}
