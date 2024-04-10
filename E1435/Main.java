package E1435;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; ++j) {
                    if ((i == 1 || j == 1) || i == n || j == n) {
                        System.out.printf("%3s", n);

                    } else {
                        System.out.printf("   ");
                    }
                }

                System.out.println();
            }
        }
    }
}
