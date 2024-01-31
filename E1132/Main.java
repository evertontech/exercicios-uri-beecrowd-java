package E1132;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int soma = 0;

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = x; i <= y; ++i){
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
