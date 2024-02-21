package E1174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] vetorReais = new float[100];

        for (int i = 0; i < 100; ++i) {
            vetorReais[i] = scanner.nextFloat();
        }

        for (int j = 0; j < 100; ++j) {
            if (vetorReais[j] <= 10) {
                System.out.printf("A[%d] = %.1f\n", j, vetorReais[j]);
            }
        }
    }
}