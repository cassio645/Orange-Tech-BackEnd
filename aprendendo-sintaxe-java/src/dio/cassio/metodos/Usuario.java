package dio.cassio.metodos;


public class Usuario {

    public static void main(String[] args) throws Exception {
        // Criando um objeto smartTv
        SmartTv smartTv = new SmartTv();

        // diminuindo volume com o metodo diminuirVolume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // ligando a tv com o metodo ligarTv
        smartTv.ligarTv();
        System.out.println("Tv ligada? " + smartTv.ligada);

        // mudando de canal
        smartTv.mudarCanal(20);
        System.out.println(smartTv.canal);
    }
}
