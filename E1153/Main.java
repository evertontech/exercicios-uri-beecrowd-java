package E1153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fatorial = n;

        for (int i = 1; i < n; ++i) {
            fatorial = fatorial * (n - i);
        }

        System.out.println(fatorial);
    }
}
