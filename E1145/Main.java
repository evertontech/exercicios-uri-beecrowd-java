package E1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 1; i <= y; ++i) {
            if (i == x) {
                System.out.print(i + " ");
                System.out.println();
                continue;
            }

            if (i > x) {
                for (int j = 1; j <= x; ++j) {
                    System.out.print(j + " ");
                }

            } else {
                System.out.print(i + " ");
            }
        }
    }
}
