package E1073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        //int quadrado;

        for (i = 1; i <= n; ++i) {
            if (i % 2 == 0) {
                double quadrado = Math.pow(i, 2);
                System.out.printf("%d^2 = %.0f\n", i, quadrado);
            }
        }

    }
}
