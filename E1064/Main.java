package E1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contador = 0;

        for (int i = 1; i <= 6; ++i) {
            double entrada = scanner.nextDouble();

            if (entrada > 0) {
                soma += entrada;
                contador++;
            }
        }

        double media = soma / contador;

        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
