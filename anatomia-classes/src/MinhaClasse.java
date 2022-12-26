public class MinhaClasse {
    public static void main(String[] args) {
        // Declarando variáveis e métodos
        String firstName = "Cássio";
        String lastName = "Santos";
        String allName;

        allName = nomeCompleto(firstName, lastName);

        System.out.println("Olá " + allName);

    }


    public static String nomeCompleto(String primeiroNome, String sobrenome){
        // Método que concatena nome e sobrenome
        String nomeCompleto = primeiroNome.concat(" ").concat(sobrenome);
        return nomeCompleto;
    }
}
