package E1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();

        if (x % 2 == 0) x++;

        for (int i = 1; i <= 6; ++i) {
            System.out.println(x);
            x += 2;
        }
    }
}
