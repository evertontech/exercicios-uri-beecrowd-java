package E1865;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; ++i) {
            String nomePersonagem = scanner.nextLine();
            //int forcaAplicada = scanner.nextInt();
            //scanner.nextLine();
            nomePersonagem.toUpperCase();

            if (nomePersonagem.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

            //scanner.nextLine();
        }
    }
}
