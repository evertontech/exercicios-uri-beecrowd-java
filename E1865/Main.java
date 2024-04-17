package E1865;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; ++i) {
            String entrada = scanner.nextLine();

            if (entrada.toUpperCase().contains("THOR")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
