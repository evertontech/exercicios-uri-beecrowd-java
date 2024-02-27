package E1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int anterior = 0;
        int atual = 1;
        int proximo;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; ++i) {
            sb.append(anterior);

            if (i != n - 1) {
                sb.append(" ");
            }
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println(sb);
    }
}
