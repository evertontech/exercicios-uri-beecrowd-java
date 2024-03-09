package E1184;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] matriz = new float[12][12];
        float soma = 0.0f;

        String t = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                matriz[i][j] = scanner.nextFloat();

                if (i > j) {
                    soma += matriz[i][j];
                    contador++;
                }
            }
        }

        if (t.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else if (t.equals("M")) {
            System.out.printf("%.1f\n", soma / contador);
        }
    }
}
