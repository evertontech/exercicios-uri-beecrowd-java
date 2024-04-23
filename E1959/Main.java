package E1959;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        if (a >= 3 && a <= 1000000 && b >= 1 && b <= 4000) {
            long p = a * b;
            System.out.println(p);
        }
    }
}
