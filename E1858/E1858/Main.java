package E1858.E1858;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] verificacao = new boolean[100];
        int[] numeros = new int[100];

        for (int i = 0; i < n; ++i) {
            int t = scanner.nextInt();

            if (t >= 0 && t < 100) {
                numeros[i] = t;
            }
        }

        int contadorNumerosUnicos = 0;

        for (int numero : numeros) {
            if (!verificacao[numero]) {
                contadorNumerosUnicos++;
                verificacao[numero] = true;
            }
        }

        System.out.println(contadorNumerosUnicos);
    }
}
