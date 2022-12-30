package dio.cassio.retornos;

public class Main {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Área do quadrado: "+ areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: "+ areaTrapezio);
    }
}
