package E1073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i = i + 2) {
            double quadrado = Math.pow(i, 2);
            System.out.printf("%d^2 = %.0f\n", i, quadrado);
        }
    }
}
