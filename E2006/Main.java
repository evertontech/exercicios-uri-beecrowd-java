package E2006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        String[] entradas = scanner.nextLine().split(" ");

        int contador = 0;

        for (String entrada : entradas) {
            if (t.equals(entrada)) {
                contador++;
            }
        }

        System.out.println(contador);

    }
}
