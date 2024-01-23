package E1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 5; ++i) {
            int entrada = scanner.nextInt();

            if (entrada % 2 == 0) {
                contador++;
            }
        }

        System.out.println(contador + " valores pares");
    }
}
