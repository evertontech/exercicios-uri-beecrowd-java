package E1116;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            float divisao = (float) x / y;

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(divisao);
            }
        }
    }
}
