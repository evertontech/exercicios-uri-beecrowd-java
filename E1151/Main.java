package E1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int anterior = 0;
        int atual = 0;
        int proximo;

        for (int i = 0; i < n; ++i) {
            proximo = anterior + atual; // 0 + 1, 1 + 1, 1, 2
            anterior = atual; // 1, 1
            atual = i; // 0, 1
            System.out.println(proximo);
        }
    }
}
