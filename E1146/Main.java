package E1146;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList<>();
        while (true) {
            int x = scanner.nextInt();

            if (x == 0) {
                 break;
             } else {
                numero.add(x);
             }
         }

        for (int i = 1; i <= numero.size(); ++i) {
            System.out.print(numero.get(i) + " ");
        }

        scanner.close();
    }
}
