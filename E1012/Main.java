package E1012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        final double pi = 3.14159;
        double areaDoTriangulo = (a * c) / 2;
        double areaDoCirculo = pi * Math.pow(c, 2);
        double areaDoTrapezio = ((a + b) * c) / 2;
        double areaDoQuadrado = b * b;
        double areaDoRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaDoTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);
    }
}
