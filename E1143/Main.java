package E1143;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        System.out.println("1 1 1");

        for (i = 2; i <= n; ++i) {
            double j2 = Math.pow(i, 2);
            double j3 = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f\n", i, j2, j3);
        }
    }
}
