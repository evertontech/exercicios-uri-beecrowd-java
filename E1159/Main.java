package E1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int soma = 0;

        do {
            x = scanner.nextInt();

            if (x % 2 != 0) {
                x++;
            }

            for (int i = 0; i < 5 && x != 0; i++) {
                soma += x + 2 * i;
            }

            System.out.println(soma);
            soma = 0;

        } while (x != 0);
    }
}
