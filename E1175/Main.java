package E1175;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorInteiros = new int[20];

        for (int i = 0; i < 20; ++i) {
            vetorInteiros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; ++i) {
            int temp = vetorInteiros[19 - i];
            vetorInteiros[19 - i] = vetorInteiros[i];
            vetorInteiros[i] = temp;
        }

        for (int i = 0; i < 20; ++i) {
            System.out.printf("N[%d] = %d\n", i, vetorInteiros[i]);
        }
    }
}
