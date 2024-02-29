package E1164;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();

            int soma = 0;
            int metade = x / 2;

            for (int j = 1; j <= metade; ++j) {
                if (x % j == 0) {
                    soma += j;
                }
            }

            if (soma == x) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
        }
    }
}
