package E1957;

import java.util.Scanner;

public class Main {
    public static void escreverHex(int valor, StringBuilder resultado) {
        if (valor < 10) {
            resultado.append(valor);
        } else {
            resultado.append(switch (valor) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> "";
            });
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        StringBuilder resultado = new StringBuilder();

        while (v >= 16) {
            escreverHex(v % 16, resultado);
            v = v / 16;
        }

        escreverHex(v, resultado);
        resultado.reverse();
        System.out.println(resultado);
    }
}
