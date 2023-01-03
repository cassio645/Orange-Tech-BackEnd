package dio.cassio.herancaassociacaointerface.aulainterface;

public class Calculadora implements OperacaoMatematica{
    
    @Override
    public void somar(double operando1, double operando2){
        System.out.println("Soma: " + operando1 + " + " + operando2 + " = " + (operando1+operando2));
    };

    @Override
    public void subtrair(double operando1, double operando2){
        System.out.println("Subtração: " + operando1 + " - " + operando2 + " = " + (operando1-operando2));
    };

    @Override
    public void multiplicar(double operando1, double operando2){
        System.out.println("Multiplica: " + operando1 + " x " + operando2 + " = " + (operando1*operando2));
    };

    @Override
    public void dividir(double operando1, double operando2){
        System.out.println("Divisão: " + operando1 + " / " + operando2 + " = " + (operando1/operando2));
    };
}
