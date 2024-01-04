package E1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int quantidadeItem = scanner.nextInt();
        double preco;
        double total;

        if (codigo == 1){
            preco = 4;
            total = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 2){
            preco = 4.50;
            total = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 3){
            preco = 5.00;
            total = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 4){
            preco = 2.00;
            total = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 5){
            preco = 1.50;
            total = preco * quantidadeItem;
            System.out.printf("Total: R$ %.2f\n", total);
        }

    }
}
