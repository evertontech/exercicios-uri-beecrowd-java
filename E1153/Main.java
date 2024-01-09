package E1153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fatorial = 1;

        for (int i = 0; i <= n; ++i) {
            n = n - i;
            System.out.println(n);
            //int multiplicacao = fatorial * n;
            //System.out.println();
            System.out.println(fatorial);
        }

        //System.out.println(fatorial);
    }
}
