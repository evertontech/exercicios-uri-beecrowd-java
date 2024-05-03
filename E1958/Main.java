package E1958;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();

        BigDecimal numero = new BigDecimal(entrada);

        String sinal = entrada.charAt(0) != '-' ? "+" : "-";

        numero = numero.abs();

        int expoente = numero.precision() - numero.scale() - 1;

        BigDecimal mantissa = numero.movePointLeft(expoente);

        mantissa = mantissa.setScale(4, RoundingMode.HALF_UP);

        String resultado = String.format("%s%sE%+03d", sinal, mantissa.toPlainString(), expoente);

        System.out.println(resultado);

    }
}

