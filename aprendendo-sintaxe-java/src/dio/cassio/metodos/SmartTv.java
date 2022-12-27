package dio.cassio.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+ volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+ volume);
    }
    public void mudarCanal(int numeroCanal){
        canal = numeroCanal;
    }

    public void aumentarCanal(){
        canal++;

    }
    public void diminuirCanal(){
        canal--;
    }
}
