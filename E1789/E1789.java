package E1789;

import java.util.Scanner;

public class E1789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nivel1 = scanner.nextInt();
        int nivel2 = scanner.nextInt();
        int nivel3 = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            int v = scanner.nextInt();

            if (v < 10) {
                nivel1 = 1;
            } else if (nivel2 >= 10 && nivel2 <= 20) {
                nivel2 = 1;
            } else if (v >= 20) {
                nivel3 = 1;
            }

            if (nivel3 == 1) {
                System.out.println("3");
                break;
            } else if (nivel2 == 1) {
                System.out.println("2");
                break;
            } else if (nivel1 == 1) {
                System.out.println("1");
                break;
            }
        }
    }
}
