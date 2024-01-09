package E1079;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();

            float media = ((a * 2) + (b * 3) + (c * 5)) / 10;

            System.out.printf("%.1f\n", media);

        }
    }
}
