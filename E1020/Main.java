package E1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int ano = valor / 365; // 1
        int mes = (valor - (365 * ano)) / 30; // 400 - 365 = 35 / 30 = 1
        int resto = valor % 365; // 400 - 365 * 1
        int restoMes = valor - (30 * mes) - (365 * ano); // 400 - 30 - 365 = 5
        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", restoMes);
    }
}
