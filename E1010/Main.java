package E1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int numeroDePeca1 = scanner.nextInt();
        float valorDaPeca1 = scanner.nextFloat();
        scanner.nextInt();
        int numeroDePeca2 = scanner.nextInt();
        float valorDaPeca2 = scanner.nextFloat();

        float valorTotal = numeroDePeca1 * valorDaPeca1 + numeroDePeca2 * valorDaPeca2;


        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}
