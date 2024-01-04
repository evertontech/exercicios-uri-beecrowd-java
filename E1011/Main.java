package E1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int raio = scanner.nextInt();
        final double pi = 3.14159;
        double volume = (4 / 3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
