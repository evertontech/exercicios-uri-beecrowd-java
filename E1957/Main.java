package E1957;

import java.util.Scanner;

public class Main {
    public static String converter(int numero) {
        return switch (numero) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> String.valueOf(numero);
        };
    }

    public static void hexa(int valor) {
        if (valor >= 16) {
            hexa(valor / 16);
            System.out.print(converter(valor % 16));
        } else {
            System.out.print(converter(valor));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();

        hexa(v);
        System.out.println();
    }
}
