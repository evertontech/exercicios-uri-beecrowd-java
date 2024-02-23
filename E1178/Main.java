package E1178;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double[] vetorReal = new double[100];
        vetorReal[0] = x;

        for (int i = 1; i < 100; ++i) {
            vetorReal[i] = vetorReal[i - 1] / 2;
        }

        for (int i = 0; i < 100; ++i) {
            System.out.printf("N[%d] = %.4f\n", i, vetorReal[i]);
        }
    }
}
