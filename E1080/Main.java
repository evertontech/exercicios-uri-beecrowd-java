package E1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int maior = 0;
        int pos = 0;

        for (int i = 1; i <= 100; ++i) {
            n = scanner.nextInt();
            if (n > maior) {
                maior = n;
                pos = i;
            }
        }

        System.out.println(maior);
        System.out.println(pos);
    }
}
