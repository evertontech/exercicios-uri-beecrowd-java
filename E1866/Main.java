package E1866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeCasosC = scanner.nextInt();
        int n;

        for (int i = 0; i < numeroDeCasosC; ++i) {
            n = scanner.nextInt();
            int contador = 0;

            for (int j = 1; j <= n; ++j) {
                if (j % 2 == 0) {
                    contador--;
                } else {
                    contador++;
                }

            }

            System.out.println(contador);
        }
    }
}
