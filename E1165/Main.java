package E1165;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            boolean achouDivisor = false;

            double raizQuadrada = Math.sqrt(x);

            for (int j = 2; j <= raizQuadrada; ++j) {
                if (x % j == 0) {
                    achouDivisor = true;
                    break;
                }
            }

            if (achouDivisor) {
                System.out.println(x + " nao eh primo");
            } else {
                System.out.println(x + " eh primo");
            }
        }
    }
}
