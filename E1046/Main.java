package E1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 2
        int b = scanner.nextInt(); // 16
        int tempoDeJogo;

        if (a < b) {
            tempoDeJogo = b - a; //  14

        } else {
            tempoDeJogo = 24 - (a - b); // 24 - 16 - 2

        }

        System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
    }
}
