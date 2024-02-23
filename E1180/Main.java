package E1180;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vetorInteiro = new int[n];
        int menorValor = 0;
        int posicao = 0;

        for (int i = 0; i < n; ++i) {
            vetorInteiro[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            if (i == 0 || vetorInteiro[i] < menorValor) {
                menorValor = vetorInteiro[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);
    }
}
