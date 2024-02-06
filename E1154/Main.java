package E1154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        float somaIdade = 0;

        while (true) {

            int idade = scanner.nextInt();

            if (idade >= 0) {
                somaIdade += idade;
                contador++;

            } else {
                break;
            }
        }

        float mediaIdade = somaIdade / contador;
        System.out.printf("%.2f\n", mediaIdade);
    }
}
