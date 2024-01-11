package E1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetorValoresDeEntrada = new double[6];
        double[] vetorValoresPositivos = new double[6];
        double soma = 0;

        int contador = 0;

        for (int i = 0; i < vetorValoresDeEntrada.length; ++i) {
            vetorValoresDeEntrada[i] = scanner.nextDouble();
            if (vetorValoresDeEntrada[i] > 0) {
                soma = soma + vetorValoresDeEntrada[i];
                contador += 1;
            }
        }

        double media = soma / contador;

        System.out.printf("%d valores positivos\n", contador);
        System.out.printf("%.1f\n", media);

    }
}
