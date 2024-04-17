package E1963;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        float aumento = (b * 100 / a) - 100;
        System.out.printf("%.2f%%\n", aumento);
    }
}
