package E2060;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int multiplo2 = 0;
        int multiplo3 = 0;
        int multiplo4 = 0;
        int multiplo5 = 0;

        for (int i = 0; i < n; ++i) {
            int numeroDeEntrada = scanner.nextInt();

            if (numeroDeEntrada % 2 == 0) {
                multiplo2 += 1;
                if (numeroDeEntrada % 4 == 0) {
                    multiplo4 += 1;
                }

                if (numeroDeEntrada % 3 == 0) {
                    multiplo3 += 1;

                    if (numeroDeEntrada % 5 == 0) {
                        multiplo5 += 1;
                    }

                } else if (numeroDeEntrada % 3 == 0) {
                    multiplo3 += 1;

                    if (numeroDeEntrada % 5 == 0) {
                        multiplo5 += 1;
                    }

                } else if (numeroDeEntrada % 5 == 0) {
                    multiplo5 += 1;
                }
            }

            System.out.println(multiplo2 + " Multiplo(s) de 2");
            System.out.println(multiplo3 + " Multiplo(s) de 3");
            System.out.println(multiplo4 + " Multiplo(s) de 4");
            System.out.println(multiplo5 + " Multiplo(s) de 5");
        }
    }
}