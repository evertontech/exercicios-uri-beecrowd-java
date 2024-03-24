package E2006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int contador = 0;

        if (t == a) {
            contador++;
        }

        if (t == b) {
            contador++;
        }

        if (t == c) {
            contador++;
        }

        if (t == d) {
            contador++;
        }

        if (t == e) {
            contador++;
        }

        System.out.println(contador);
    }
}
