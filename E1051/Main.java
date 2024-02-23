package E1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float renda = scanner.nextFloat();
        float faixa2 = 0f;
        float faixa3 = 0f;
        float impostoFaixa2 = 0;
        float impostoFaixa3 = 0;
        float impostoFaixa4 = 0;

        if ((renda > 0) && (renda <= 2000.00)) {
            System.out.println("Isento");
        } else if ((renda >= 2000.01) && (renda <= 3000.00)) {
            faixa2 = renda - 2000;
            impostoFaixa2 = faixa2 * 0.08f;
            System.out.printf("R$ %.2f\n", impostoFaixa2);
        } else if ((renda > 3000.01) && (renda <= 4500.00)) {
            impostoFaixa2 = 1000 * 0.08f;
            impostoFaixa3 = ((renda - 2000 - 1000) * 0.18f) + impostoFaixa2;
            System.out.printf("R$ %.2f\n", impostoFaixa3);
        } else if (renda > 4500.00) {
            impostoFaixa2 = 1000 * 0.08f;
            faixa3 = 1500 * 0.18f;
            impostoFaixa3 = faixa3;
            impostoFaixa4 = ((renda - 2000 - 1000 - 1500) * 0.28f) + impostoFaixa2 + impostoFaixa3;
            System.out.printf("R$ %.2f\n", impostoFaixa4);
        }
    }
}
