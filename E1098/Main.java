package E1098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (double i = 0; i <= 2; i += 0.2) {
            for (double j = 1; j <= 3; ++j) {
                if ((int) i == i) {
                    if ((int) j == j) {
                        System.out.printf("I=%.0f J=%.0f\n", i, j);
                    } else {
                        System.out.printf("I=%.0f J=%.1f\n", i, j);
                    }

                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, j + i);
                }
            }
        }
    }
}
