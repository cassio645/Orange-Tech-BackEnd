package dio.cassio.blocosecontrolefluxo;
/**
 * Classe de exemplo para o exrcicio da Aula 3 de controle de fluxo e blocos.
 */

public class Fluxo {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();

        switchSemana();
        switchNumero();
        siwtchFerias();

    }

private static void ifFlecha(){
    int mes = 9;
    if (mes == 1){
        System.out.println("Janeiro");
    }else{
        if (mes == 2){
            System.out.println("Fevereiro");
        }else{
            if (mes == 3){
                System.out.println("Março");
            }else{
                if (mes == 4){
                    System.out.println("Abril");
                }else{
                    if (mes == 5){
                        System.out.println("Maio");
                    }else{
                        System.out.println("Deu pra entender. Não é bom usar assim.");
                    }
                }
            }
        }
    }
}

private static void ifSemFlecha(){
    int mes = 9;
    if (mes == 1){
        System.out.println("Janeiro");
    }else if (mes == 2){
        System.out.println("Fevereiro");
    }else if (mes == 3){
        System.out.println("Março");
    }else if (mes == 4){
        System.out.println("Abril");
    }else if (mes == 5){
        System.out.println("Maio");
    }else{
        System.out.println("Melhor do que o anterior");
    }
}

private static void ifFerias(){
    // Não deve ser feito. PAra casos assim usar o switch
    String mes = "Julho";
    if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro"){
        System.out.println("Férias");
    }
}

private static void switchSemana(){
    String dia = "Terça";

    switch (dia){
        case "Segunda":
            System.out.println(2);
            break;
        case "Terça":
            System.out.println(3);
            break;
        case "Quarta":
            System.out.println(4);
            break;
        case "Quinta":
            System.out.println(5);
            break;
        case "Sexta":
            System.out.println(6);
        default:
            System.out.println(1);
            break;
    }
}

private static void switchNumero(){
    int numero = 4;
    switch (numero){
        // Neste caso se o numero for 1, 2 ou 3 ele printa "Certo"
        case 1:
        case 2:
        case 3:
            System.out.println("Certo");
            break;
        case 4:
            System.out.println("Errado");
            break;
        case 5:
            System.out.println("Talvez");
            break;
        default:
            System.out.println("Valor indefinido");
            break;
    }
}

private static void siwtchFerias(){
    String mes = "Dezembro";
    switch (mes){
        case "Dezembro":
        case "Janeiro":
        case "Julho":
            System.out.println("Férias");
            break;
        default:
            System.out.println("Férias indefinidas");
            break;
    }
}

}