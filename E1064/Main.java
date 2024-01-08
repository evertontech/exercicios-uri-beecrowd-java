package E1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media;
        int i;
        float somaPositivos = 0;
        float contadorDePositivos = 0;

        for (i = 0; i < 6; ++i) {
            float valor = scanner.nextFloat();
            if (valor > 0) {
                somaPositivos = somaPositivos + valor;
                contadorDePositivos = i;
            }
        }

        media = somaPositivos / contadorDePositivos;

        System.out.printf("%d valores positivos\n", contadorDePositivos);
        System.out.printf("%.1f\n", media);
    }
}
