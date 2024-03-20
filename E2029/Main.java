package E2029;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        while (scanner.hasNext()) {

            double volume = scanner.nextDouble();
            double diametro = scanner.nextDouble();
            double raio = diametro / 2;
            double area = PI * Math.pow(raio, 2);
            double altura = volume / area;
            System.out.printf("ALTURA = %.2f\n", altura);
            System.out.printf("AREA = %.2f\n", area);

        }
    }
}
