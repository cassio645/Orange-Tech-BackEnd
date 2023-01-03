package dio.cassio.herancaassociacaointerface.abstracao;

/**
 * Classe de exemplo para o exercício da aula 2 de orientação a objeto.
 */
public class Vendedor extends Funcionario{
    
    @Override
    void metodo1(){
        System.out.println("Método 1 da classe filha, Vendedor");
    }

    @Override
    void metodo2(){
        System.out.println("Método 2 da classe filha, Vendedor");
    }
}
