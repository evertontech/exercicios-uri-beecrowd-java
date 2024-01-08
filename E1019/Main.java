package E1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int horas;
        int minutos;
        int restoSegundos;
        if (valor > 3600) {
            horas = valor / 3600; // 140153 / 3600 = 38
            minutos = (valor - (3600 * horas)) / 60; // 140153 - 3600 * 38 = 3353 / 60 = 55
            restoSegundos = valor - (3600 * horas) - (60 * minutos);
            System.out.printf("%d:%d:%d\n", horas, minutos, restoSegundos);
        } else if (valor > 60) {
            minutos = valor / 60; // 65 / 60 = 1
            restoSegundos = valor - (60 * minutos); // 65 - 60 * 1 = 5
            System.out.printf("0:%d:%d\n", minutos, restoSegundos);
        } else {
            System.out.printf("0:0:%d\n", valor);
        }
    }
}
