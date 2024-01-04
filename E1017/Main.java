package E1017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempoGastoNaViagem = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        float tempoGastoNaViagemFloat = (float) tempoGastoNaViagem;
        float velocidadeMediaFloat = (float) velocidadeMedia;
        float litrosNecessarios = (velocidadeMediaFloat / 12) * tempoGastoNaViagemFloat;
        System.out.printf("%.3f\n", litrosNecessarios);
    }
}
