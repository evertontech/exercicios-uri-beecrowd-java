package E1074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();

            if (x == 0) {
                System.out.println("NULL");

            } else {
                if (x % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }

                if (x > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
    }
}
