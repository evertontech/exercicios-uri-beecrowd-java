package E1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int in = 0;
        int out = 0;
        int x;

        for (int i = 0; i < n; ++i) {
            x = scanner.nextInt();
            if (x >= 0 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
