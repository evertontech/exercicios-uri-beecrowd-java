package E1101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }

            if (n > m) {
                int temp = m;
                m = n;
                n = temp;
            }

            int soma = 0;

            for (int i = n; i <= m; ++i) {
                System.out.print(i + " ");
                soma = soma + i;
            }

            System.out.println("Sum=" + soma);

        } while (true);
    }
}




