package dio.cassio.criacao;

/**
 * Classe de exemplo para o exercício da aula 1 de métodos.
 */

public class Mensagem {
    /**
     * Este método é utilizado para somar dois números 
     * @param hora
     * @void Mostra uma mensagem de Bom dia, Boa tarde ou Boa noite
     */
    public static void obterMensagem(int hora){
        if (hora > 0 && hora < 12){
            mensagemBomDia();

        }else if (hora < 18){
            mensagemBoaTarde();
            
        }else if (hora < 24){
            mensagemBoaNoite();
            
        }else{
            System.out.println("Hora inválida.");
        }
    }

    public static void mensagemBomDia(){
        System.out.println("Bom dia");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Boa tarde");   
    }

    public static void mensagemBoaNoite(){
        System.out.println("Boa noite");  
    }

}
