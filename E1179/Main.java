package E1179;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];
        int indexPar = 0;
        int indexImpar = 0;

        for (int i = 0; i < 15; ++i) {
            x = scanner.nextInt();

            if (x % 2 != 0) {
                vetorImpar[indexImpar] = x;
                indexImpar++;
            } else {
                vetorPar[indexPar] = x;
                indexPar++;
            }

            if (indexImpar == 5 || i == 14) {
                for (int j = 0; j < indexImpar; ++j) {
                    System.out.println("impar[" + j + "] = " + vetorImpar[j]);
                }

                indexImpar = 0;
            }

            if (indexPar == 5 || i == 14) {
                for (int j = 0; j < indexPar; ++j) {
                    System.out.println("par[" + j + "] = " + vetorPar[j]);
                }

                indexPar = 0;
            }
        }
    }
}
