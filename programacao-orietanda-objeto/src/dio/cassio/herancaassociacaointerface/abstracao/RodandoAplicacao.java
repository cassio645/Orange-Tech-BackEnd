package dio.cassio.herancaassociacaointerface.abstracao;

public class RodandoAplicacao {
    public static void main(String[] args) {
        Funcionario[] classes = new Funcionario[]{ new Vendedor(), new Gerente(), new Funcionario()};

        for (Funcionario classe: classes){
            classe.metodo1();
        }

        System.out.println();

        for (Funcionario classe: classes){
            classe.metodo2();
        }

        System.out.println();

        Vendedor vendedor = new Vendedor();
        vendedor.metodo2();
    }
}
