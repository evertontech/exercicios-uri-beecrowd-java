package E1182;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        scanner.nextLine();
        String t = scanner.nextLine();
        float[][] matriz = new float[12][12];
        float soma = 0.0f;
        float media = 0.0f;

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                float x = scanner.nextFloat();
                matriz[i][j] = x;
            }
        }

        for (int i = 0; i < 12; ++i) {
            soma += matriz[i][c];
            media += matriz[i][c];
        }

        if (t.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else if (t.equals("M")) {
            media = media / 12;
            System.out.printf("%.1f\n", media);
        }
    }
}
