package E1067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i;
        for (i = 1; i <= x; ++i){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
