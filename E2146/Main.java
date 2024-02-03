package E2146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;

        while (scanner.hasNextInt()) {
            senha = scanner.nextInt();
            senha = senha - 1;
            System.out.println(senha);
        }

        scanner.close();
    }
}
