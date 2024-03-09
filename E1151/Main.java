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

        sb.append(anterior);

        for (int i = 1; i < n; ++i) {
            sb.append(" ").append(atual);
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println(sb);
    }
}
