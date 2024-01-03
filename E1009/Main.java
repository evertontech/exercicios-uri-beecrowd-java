package E1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double vendasTotais = scanner.nextDouble();
        double comissao = vendasTotais * 0.15;
        double salarioTotal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }
}
