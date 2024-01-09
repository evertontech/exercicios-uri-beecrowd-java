package E1078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int produto;
        for (int i = 1; i <= 10; ++i) {
            produto = i * n;
            System.out.println(i + " x " + n + " = " + produto);
        }
    }
}
