package E1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanciaTotal = scanner.nextInt();
        float totalDeCombustivelGasto = scanner.nextFloat();
        float consumoMedio = distanciaTotal / totalDeCombustivelGasto;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}
