package E1118;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador;
        float mediaNotas;
        int novoCalculo;

        do {
            contador = 0;
            mediaNotas = 0;

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

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = scanner.nextInt();
            } while (novoCalculo != 1 && novoCalculo != 2);

        } while (novoCalculo == 1);
    }
}

