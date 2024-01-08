package E1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int i;
        int contadorInicial = 0;
        int contadorFinal = 0;

        if (horaInicial < 12) {
            if (horaFinal == 0) {
                for (i = 0; i <= 24; ++i) {
                    contadorFinal = i - horaInicial; // 0 - 0
                }
                System.out.printf("O JOGO DUROU %d HORA(S)\n", contadorFinal);

            } else {
                for (i = 0; i <= horaFinal; ++i) {
                    contadorFinal = i - horaInicial; // 0 - 0
                }
                System.out.printf("O JOGO DUROU %d HORA(S)\n", contadorFinal);
            }

        } else if (horaInicial > 12) {
            for (i = 0; i <= horaInicial; ++i) {
                contadorInicial = i; // 16
            }

            for (i = 0; i <= horaFinal; ++i) {
                contadorFinal = 24 - i; // 24 - 2 = 22
            }

            int duracaoJogo = (24 - contadorInicial) + (24 - contadorFinal); // 24 - 16 + 24 - 22
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracaoJogo);
        }
    }
}
