package E1117;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        float mediaNotas = 0;

        while (contador < 2) {
            float nota = scanner.nextFloat();

            if (nota >= 0 && nota <= 10) {
                contador++;
                mediaNotas += nota;
            } else {
                System.out.println("nota invalida");
            }
        }

        mediaNotas = mediaNotas / 2;
        System.out.printf("media = %.2f\n", mediaNotas);
    }
}
