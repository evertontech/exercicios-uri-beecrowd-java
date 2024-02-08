package E1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        for (int i = 1; i <= y; i++) {
            System.out.printf("%d", i);

            if (i % x == 0) {
                System.out.println();
            } else if (i != y) {
                System.out.print(" ");
            }
        }
    }
}
