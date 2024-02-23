package E1181;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] matrizReal = new float[12][12];
        int linhaEscolhida = scanner.nextInt();
        scanner.nextLine();
        String operacao = scanner.nextLine();

        for (int linha = 0; linha < 12; ++linha) {
            for (int coluna = 0; coluna < 12; ++coluna) {
                matrizReal[linha][coluna] = scanner.nextFloat();
            }
        }

        float soma = 0.0f;

        for (int coluna = 0; coluna < 12; ++coluna) {
            soma += matrizReal[linhaEscolhida][coluna];
        }

        if (operacao.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else {
            float media = soma / 12;
            System.out.printf("%.1f\n", media);
        }
    }
}
