package E1006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double media = (2 * a + 3 * b + 5 * c) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
