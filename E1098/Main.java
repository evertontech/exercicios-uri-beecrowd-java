package E1098;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal zeroPontoDois = new BigDecimal("0.2");
        BigDecimal zero = new BigDecimal("0");
        BigDecimal um = new BigDecimal("1");
        BigDecimal dois = new BigDecimal("2");
        BigDecimal tres = new BigDecimal("3");

        for (BigDecimal i = zero; i.compareTo(dois) <= 0; i = i.add(zeroPontoDois)) {
            for (BigDecimal j = um; j.compareTo(tres) <= 0; j = j.add(um)) {

                if (i.stripTrailingZeros().scale() == 0) {
                    System.out.printf("I=%.0f ", i);
                } else {
                    System.out.printf("I=%.1f ", i);
                }

                BigDecimal soma = i.add(j);

                if (soma.stripTrailingZeros().scale() == 0) {
                    System.out.printf("J=%.0f\n", soma);
                } else {
                    System.out.printf("J=%.1f\n", soma);
                }
            }
        }
    }
}
