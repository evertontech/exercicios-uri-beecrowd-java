package E1188;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operacao = scanner.nextLine();
        double[][] matriz = new double[12][12];
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        int contador = 0;

        for (int i = 0; i < 12; ++i) {
            for ( int j = 0; j < 12; ++j) {
                if (i + j > 11 && i > j) {
                    soma += matriz[i][j];
                    contador++;
                }
            }
        }

        if (operacao.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else if (operacao.equals("M")) {
            System.out.printf("%.1f\n", soma / contador);
        }
    }
}
