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
            } else if (x % 2 == 0) {
                if (x > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else if (x % 2 != 0){
                    if (x > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
            }
        }
    }
}
