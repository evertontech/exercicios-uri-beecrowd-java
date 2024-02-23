package E1144;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            int j2 = (int) Math.pow(i, 2);
            int j3 = (int) Math.pow(i, 3);

            System.out.println(i + " " + j2 + " " + j3);
            System.out.println(i + " " + (j2 + 1) + " " + (j3 + 1));
        }
    }
}
