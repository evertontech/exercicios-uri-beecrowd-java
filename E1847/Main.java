package E1847;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b <= c) { // ok
            System.out.println(":)");
        }

        if (b > a && b >= c) { // ok
            System.out.println(":(");
        }

        if (b > a && c > b && c - b < b - a) { // ok
            System.out.println(":(");
        }

        if (b > a && c > b && (c - b) >= (b - a)) { // ok
            System.out.println(":)");
        }

        if (a > b && b > c && (b - c) < (a - b)) { // ok
            System.out.println(":)");
        }

        if (a > b && b > c && (b - c) >= (a - b)) {
            System.out.println(":(");
        }

        if (a == b && c > b) {
            System.out.println(":)");
        }

        if (a == b && b >= c) {
            System.out.println(":(");
        }
    }
}
