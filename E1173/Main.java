package E1173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] vetorInteiros = new int[10];

        vetorInteiros[0] = x;

        for (int i = 1; i < 10; ++i) {
            vetorInteiros[i] = vetorInteiros[i - 1] * 2;
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println("N[" + i + "] = " +  vetorInteiros[i]);
        }
    }
}
