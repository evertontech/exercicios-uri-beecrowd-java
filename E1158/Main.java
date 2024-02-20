package E1158;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soma = 0;
        int contador = 0;
        int j = 0;

        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x % 2 == 0) {
                x++;
            }

            while (contador != y) {
                soma += x + j;
//                System.out.println("primeira soma: " + soma);
                contador++;

//                System.out.println("contador: " + contador);
                j = j + 2;

                if (contador == 1) {
                    j = 2;
                }
//                System.out.println("j quadrado = " + j);
            }

            System.out.println(soma);
            soma = 0;
            contador = 0;
            j = 0;
            x = 0;
        }
    }
}
