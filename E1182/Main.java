package E1182;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] matriz = new float[12][12];
        float soma = 0.0f;

        int c = scanner.nextInt();
        scanner.nextLine();
        String t = scanner.nextLine();

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                matriz[i][j] = scanner.nextFloat();
            }
        }

        for (int i = 0; i < 12; ++i) {
            soma += matriz[i][c];
        }

        if (t.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else if (t.equals("M")) {
            System.out.printf("%.1f\n", soma / 12);
        }
    }
}
