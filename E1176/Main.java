package E1176;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] vetor = new long[61];
        int t = scanner.nextInt();

        vetor[0] = 0;
        vetor[1] = 1;

        for (int i = 2; i < 61; ++i) {
            vetor[i] = vetor[i - 2] + vetor[i - 1];
        }

        for (int i = 0; i < t; ++i) {
            int n = scanner.nextInt();
            System.out.println("Fib(" + n + ") = " + vetor[n]);
        }
    }
}
