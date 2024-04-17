package E1914;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeTestes = scanner.nextInt();

        for (int i = 0; i < quantidadeDeTestes; ++i) {
            scanner.nextLine();
            String[] entradas = scanner.nextLine().split(" ");
            int numeroJogador1 = scanner.nextInt();
            int numeroJogador2 = scanner.nextInt();

            String nomeJogador1 = entradas[0];
            String apostaJogador1 = entradas[1];
            String nomeJogador2 = entradas[2];

            int soma = numeroJogador1 + numeroJogador2;

            if (soma % 2 == 0) {
                if (apostaJogador1.equals("PAR")) {
                    System.out.println(nomeJogador1);
                } else {
                    System.out.println(nomeJogador2);
                }
            } else {
                if (apostaJogador1.equals("IMPAR")) {
                    System.out.println(nomeJogador1);
                } else {
                    System.out.println(nomeJogador2);
                }
            }
        }
    }
}
