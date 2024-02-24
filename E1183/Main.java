package E1183;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String o = scanner.nextLine();
        scanner.nextLine();
        float valores = scanner.nextFloat();
        float[][] matriz = new float[12][12];
        float soma = 0.0f;
        float media = 0.0f;

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                matriz[i][j] = valores;
            }
        }

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                soma += matriz[i][j];
                media += matriz[i][j];
            }
        }

        if (o.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else if (o.equals("M")) {
            System.out.printf("%.1f\n", media);
        }
    }
}
