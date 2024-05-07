package E1985;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeProdutosComprados = scanner.nextInt();
        double precoTotal = 0;

        for (int i = 0; i < quantidadeDeProdutosComprados; ++i) {
            int codigoDoProduto = scanner.nextInt();
            int quantidade = scanner.nextInt();

            precoTotal += switch (codigoDoProduto) {
                case 1001 -> 1.50 * quantidade;
                case 1002 -> 2.50 * quantidade;
                case 1003 -> 3.50 * quantidade;
                case 1004 -> 4.50 * quantidade;
                case 1005 -> 5.50 * quantidade;
                default -> 0;
            };
        }

        System.out.printf("%.2f\n", precoTotal);
    }
}
