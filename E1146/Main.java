package E1146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();
        int x;

        while (true) {
            x = scanner.nextInt();

            if (x == 0) break;

            resultado.setLength(0);

            resultado.append("1");

            for (int i = 2; i <= x; ++i) {
                resultado.append(" ").append(i);
            }

            System.out.println(resultado);
        }
    }
}