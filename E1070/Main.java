package E1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i;

        for (i = x; i <= x + 11; ++ i) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
