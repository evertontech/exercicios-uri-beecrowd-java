package E1160;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; ++i) {
            String linha1 = scanner.nextLine();
//            String pb = scanner.nextLine();
//            String g1 = scanner.nextLine();
//            String g2 = scanner.nextLine();

            String[] vetorString = linha1.split(" ");

            int pa = Integer.parseInt(vetorString[0]);
            int pb = Integer.parseInt(vetorString[1]);
            double g1 = Double.parseDouble(vetorString[2]);
            double g2 = Double.parseDouble(vetorString[3]);

            System.out.println(pa);
            System.out.println(pb);
            System.out.println(g1);
            System.out.println(g2);
        }

    }
}
