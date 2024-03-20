package E1557;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int t = scanner.nextInt();

            if (t == 0) {
                break;
            }

            int[][] matriz = new int[t][t];

            for (int i = 0; i < t; ++i) {
                for (int j = 0; j < t; ++j) {
                    System.out.println(matriz[i][i]);
                }
            }
        }
    }
}
