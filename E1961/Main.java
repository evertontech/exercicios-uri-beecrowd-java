package E1961;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoDoPulo = scanner.nextInt();
        int numeroDeCasos = scanner.nextInt();
        int[] vetorN = new int[numeroDeCasos];
        boolean vencedor = true;

        for (int i = 0; i < numeroDeCasos; ++i) {
            int valor = scanner.nextInt();
            vetorN[i] = valor;
        }

        for (int i = 0; i < numeroDeCasos - 1; ++i) {
            int valorAbs = Math.abs(vetorN[i] - vetorN[i + 1]);

            if (valorAbs > tamanhoDoPulo) {
                vencedor = false;
                break;
            }
        }

        System.out.println(vencedor ? "YOU WIN" : "GAME OVER");
    }
}
