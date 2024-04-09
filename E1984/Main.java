package E1984;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long valorN = scanner.nextLong();

        String valorNConvertido = Long.toString(valorN);
        StringBuilder valorInvertido = new StringBuilder();

        for (int i = valorNConvertido.length() - 1; i >= 0; --i) {
            valorInvertido.append(valorNConvertido.charAt(i));
        }

        System.out.println(valorInvertido);
    }
}
