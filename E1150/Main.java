package E1150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int soma = 0;
        int z;
        int contador = 0;

        do {
            z = scanner.nextInt();
        } while (z <= x);

        for (int i = x; soma <= z + 1; ++i) {
            soma = soma + i;
            contador++;
        }

        System.out.println(contador);
    }
}
