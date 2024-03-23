package E1984;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long valorN = scanner.nextLong();

        String valorNConvertido = Long.toString(valorN);
        String valorInvertido = "";

        for (int i = valorNConvertido.length() - 1; i >= 0; --i) {
            valorInvertido += valorNConvertido.charAt(i);
        }

        System.out.println(valorInvertido);
    }
}
