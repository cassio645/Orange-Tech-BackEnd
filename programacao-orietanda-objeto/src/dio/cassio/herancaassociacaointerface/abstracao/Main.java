package dio.cassio.herancaassociacaointerface.abstracao;

/**
 * Classe de exemplo para o exercício da aula 4 de orientação a objeto.
 */
public class Main {
    public static void main(String[] args) {
        
        // Criando classe funcionario
        Funcionario funcionario = new Funcionario();

        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        // Downcast
        //Vendedor vendedor_ = (Vendedor) new Funcionario();
        // Da erro downcast
    }
}
