package E1175;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorInteiros = new int[20];

        for (int i = 0; i < 20; ++i) {
            int x = scanner.nextInt();
            vetorInteiros[i] = x;
        }

        for (int i = 1; i <= 20; ++i) {
            vetorInteiros[20 - i] = vetorInteiros[i - 1];
        }

        for (int i = 1; i <=20; ++i) {
            System.out.printf("N[%d] = %d\n", i, vetorInteiros[i]);
        }

    }
}
