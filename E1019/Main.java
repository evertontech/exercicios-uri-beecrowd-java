package E1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = new Scanner(System.in).nextInt();

        int horas = valor / 3600;
        valor -= horas * 3600;

        int minutos = valor / 60;
        valor -= minutos * 60;

        int segundos = valor;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    }
}
