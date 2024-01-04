package E1017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempoGastoNaViagem = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        float litrosNecessarios = (velocidadeMedia / 12f) * tempoGastoNaViagem;
        System.out.printf("%.3f\n", litrosNecessarios);
    }
}
