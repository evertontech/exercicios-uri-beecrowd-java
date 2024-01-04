package E1015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double diferenca1 = x2 - x1;
        double diferenca2 = y2 - y1;
        double quadrado1 = Math.pow(diferenca1, 2);
        double quadrado2 = Math.pow(diferenca2, 2);
        double soma = quadrado1 + quadrado2;
        double distancia = Math.sqrt(soma);

        System.out.printf("%.4f\n", distancia);
    }
}
