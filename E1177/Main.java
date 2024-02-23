package E1177;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] vetorInteiros = new int[1000];

        for (int i = 0, x = 0; i < 1000; ++i) {
            vetorInteiros[i] = x;
            x++;

            if (x == t) {
                x = 0;
            }
        }

        for (int i = 0; i < 1000; ++i) {
            System.out.printf("N[%d] = %d\n", i, vetorInteiros[i]);
        }
    }
}
