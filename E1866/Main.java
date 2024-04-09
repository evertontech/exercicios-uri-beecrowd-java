package E1866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeCasosC = scanner.nextInt();

        for (int i = 0; i < numeroDeCasosC; ++i) {
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
