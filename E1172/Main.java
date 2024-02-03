package E1172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorInteiros = new int[10];

        for (int i = 0; i < 10; ++i) {
            vetorInteiros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; ++i) {
            if (vetorInteiros[i] <= 0) {
                vetorInteiros[i] = 1;
            }
        }

        for (int i = 0; i < 10; ++i) {
            System.out.printf("X[%d] = %d\n", i, vetorInteiros[i]);
        }
    }
}
