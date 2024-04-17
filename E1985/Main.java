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

            switch (codigoDoProduto) {
                case 1001:
                    precoTotal += 1.50 * quantidade;
                    break;

                case 1002:
                    precoTotal += 2.50 * quantidade;
                    break;

                case 1003:
                    precoTotal += 3.50 * quantidade;
                    break;

                case 1004:
                    precoTotal += 4.50 * quantidade;
                    break;

                case 1005:
                    precoTotal += 5.50 * quantidade;
                    break;
            }
        }

        System.out.printf("%.2f\n", precoTotal);
    }
}
