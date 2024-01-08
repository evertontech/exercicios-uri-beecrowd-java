package E1016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanciaDeKm = scanner.nextInt();
        int tempoNecessario = distanciaDeKm * 2;

        System.out.printf("%d minutos\n", tempoNecessario);
    }
}
