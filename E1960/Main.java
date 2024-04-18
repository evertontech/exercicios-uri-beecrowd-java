package E1960;

import java.util.Scanner;

public class Main {
    public static void escrever(String c, int quantidade) {
        for (int i = 0; i < quantidade; ++i) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int d = n / 500;
        escrever("D", d);
        n %= 500; // 666 % 500 = 166

        int c = n / 100;
        escrever("C", c);
        n %= 100;








    }
}
