package E1789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int maiorValor = 0;
            int n = scanner.nextInt();

            for (int i = 0; i < n; ++i) {
                int velocidade = scanner.nextInt();

                if (maiorValor <= velocidade) {
                    maiorValor = velocidade;
                }
            }

            if (maiorValor < 10) {
                System.out.println("1");
            } else if (maiorValor < 20) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}

