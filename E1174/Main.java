package E1174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetorReais = new double[100];

        for (int i = 0; i < 100; ++i) {
            double x = scanner.nextDouble();
            if (x <= 10) {
                vetorReais[i] = x;
            }


        }

        for (int j = 0; j < 100; ++j) {
            System.out.printf("A[%d] = %.1f\n", j, vetorReais[j]);
        }

    }
}