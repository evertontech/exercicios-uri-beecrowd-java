package E1142;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n * 4; i = i + 4) {
            System.out.printf("%d %d %d PUM\n", i, i + 1, i + 2);
        }
    }
}
