package E1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int quantidadeItem = scanner.nextInt();

        double preco = switch (codigo) {
            case 1 -> 4;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            case 5 -> 1.50;
            default -> 0.00;
        };

        double total = preco * quantidadeItem;
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
