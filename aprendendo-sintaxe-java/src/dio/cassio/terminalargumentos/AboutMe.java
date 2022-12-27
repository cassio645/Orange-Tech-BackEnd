package dio.cassio.terminalargumentos;

public class AboutMe {
    public static void main(String[] args) {
        
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        double altura = Double.valueOf(args[2]);

        System.out.println("Olá, me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é "+ altura + " m");
    }
}
