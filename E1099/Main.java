package E1099;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int j = 0; j < n; ++j) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x > y) {
                int temp = y;
                y = x;
                x = temp;
            }

            int soma = 0;

            for (int i = x + 1; i < y; ++i) {
                if (i % 2 != 0) {
                    soma = soma + i;
                }
            }

            System.out.println(soma);
        }
    }
}
