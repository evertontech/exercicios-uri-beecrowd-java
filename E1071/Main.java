package E1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int somaImpares = 0;

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = y + 1; i < x; ++i) {
            if (i % 2 != 0) {
                somaImpares = somaImpares + i;
            }
        }
        System.out.println(somaImpares);
    }
}

