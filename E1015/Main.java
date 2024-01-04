package E1015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();

        double diferenca1 = x2 - x1;
        double diferenca2 = x4 - x3;
        double distanciaX1X2 = Math.pow(diferenca1, 2);
        double distanciaX3X4 = Math.pow(diferenca2, 2);
        double distanciaComRaiz = distanciaX1X2 + distanciaX3X4;
        double distancia = Math.sqrt(distanciaComRaiz);

        System.out.printf("%.5f\n", distancia);
//        System.out.println(distanciaX1X2);
//        System.out.println(distanciaX3X4);
//        System.out.println(distanciaComRaiz);
    }
}
