package E1858;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] t = new int[100];
        int n = scanner.nextInt();
        int menorValor = 21;
        int indiceMenorValor = 0;

        for (int i = 0; i < n; ++i) {
            t[i] = scanner.nextInt();

            if (t[i] < menorValor) {
                menorValor = t[i];
                indiceMenorValor = i;
            }
        }

        System.out.println(indiceMenorValor + 1);

    }
}
