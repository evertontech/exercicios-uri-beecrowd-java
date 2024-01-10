package E1021;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal valor = new BigDecimal(scanner.nextLine()); // 576,73
        int quantidadeDeNotas;

        int reais = valor.intValue(); // 576

        BigDecimal centavosDecimal = valor.subtract(BigDecimal.valueOf(reais)); // 576,73 - 576 = 0,73

        int centavos = centavosDecimal
                .multiply(BigDecimal.valueOf(100))
                .setScale(0, RoundingMode.HALF_UP)
                .intValue(); // 73

        System.out.println("NOTAS:");

        quantidadeDeNotas = reais / 100;
        reais = reais % 100;
        System.out.println(quantidadeDeNotas + " nota(s) de R$ 100.00");

        quantidadeDeNotas = reais / 50;
        reais = reais % 50;
        System.out.println(quantidadeDeNotas + " nota(s) de R$ 50.00");

        quantidadeDeNotas = reais / 20;
        reais = reais % 20;
        System.out.println(quantidadeDeNotas + " nota(s) de R$ 20.00");

        quantidadeDeNotas = reais / 10;
        reais = reais % 10;
        System.out.println(quantidadeDeNotas + " nota(s) de R$ 10.00");

        quantidadeDeNotas = reais / 5;
        reais = reais % 5;
        System.out.println(quantidadeDeNotas + " nota(s) de R$ 5.00");

        quantidadeDeNotas = reais / 2;
        reais = reais % 2;
        System.out.println(quantidadeDeNotas + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");

        int quantidadeMoedas = reais;
        System.out.println(quantidadeMoedas + " moeda(s) de R$ 1.00");

        quantidadeMoedas = centavos / 50;
        centavos = centavos % 50;
        System.out.println(quantidadeMoedas + " moeda(s) de R$ 0.50");

        quantidadeMoedas = centavos / 25;
        centavos = centavos % 25;
        System.out.println(quantidadeMoedas + " moeda(s) de R$ 0.25");

        quantidadeMoedas = centavos / 10;
        centavos = centavos % 10;
        System.out.println(quantidadeMoedas + " moeda(s) de R$ 0.10");

        quantidadeMoedas = centavos / 5;
        centavos = centavos % 5;
        System.out.println(quantidadeMoedas + " moeda(s) de R$ 0.05");

        quantidadeMoedas = centavos;
        System.out.println(quantidadeMoedas + " moeda(s) de R$ 0.01");
    }
}

// 0.03
// 0.02009
