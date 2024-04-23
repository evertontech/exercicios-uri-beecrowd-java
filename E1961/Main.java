package E1961;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoDoPulo = scanner.nextInt();
        int numeroDeCasos = scanner.nextInt();
        int[] vetorN = new int[numeroDeCasos];
        boolean vencedor = false;

        for (int i = 0; i < numeroDeCasos; ++i) {
            int valor = scanner.nextInt();
            vetorN[i] = valor;
        }

        for (int i = 1; i < numeroDeCasos; ++i) {
            if ((vetorN[i] - vetorN[i - 1]) > tamanhoDoPulo) {
                vencedor = false;
            } else {
                vencedor = true;
            }
        }

        if (vencedor) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }
    }
}
