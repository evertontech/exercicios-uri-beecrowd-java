package E1914;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes; ++i) {
            String nome1 = scanner.nextLine();
            String jogada1 = scanner.nextLine();
            String nome2 = scanner.nextLine();
            String jogada2 = scanner.nextLine();

            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();

            int soma = numero1 + numero2;

            if (soma % 2 == 0) {
                System.out.println(nome1);
            } else {
                System.out.println(nome2);
            }
        }

    }
}
