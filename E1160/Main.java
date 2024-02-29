package E1160;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; ++i) {
            long populacaoA = scanner.nextLong();
            long populacaoB = scanner.nextLong();
            double g1 = scanner.nextDouble();
            double g2 = scanner.nextDouble();

            int quantidadeDeAnos = 0;

            while (populacaoA <= populacaoB) {
                populacaoA += (long) (populacaoA * g1 / 100);
                populacaoB += (long) (populacaoB * g2 / 100);
                quantidadeDeAnos++;

                if (quantidadeDeAnos > 100) {
                    break;
                }
            }

            if (quantidadeDeAnos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(quantidadeDeAnos + " anos.");
            }
        }
    }
}



