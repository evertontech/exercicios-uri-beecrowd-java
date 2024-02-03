package E1173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] vetorInteiros = new int[10];

        vetorInteiros[0] = x;

        for (int i = 0; i < 9; ++i) {
            vetorInteiros[i + 1] = vetorInteiros[i] * 2;
        }

        for (int i = 0; i < 10; ++i) {
            System.out.printf("N[%d] = %d\n", i, vetorInteiros[i]);
        }
    }
}
