package E1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n;
        int soma = 0;
        int contador = 0;
        int i = 0;

        do {
            n = scanner.nextInt();
        } while (n <= 0);

        while (contador != n) {
            soma = soma + a + i;
            contador++;
            i++;
        }

        System.out.println(soma);
    }
}
