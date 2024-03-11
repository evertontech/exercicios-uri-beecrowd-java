package E1864;

import java.util.Scanner;

public class E1864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "life is not a problem to be solved";
        int contadorLetras = 0;

        for (char letra : frase.toCharArray()) {
            int qtdLetras = scanner.nextInt();

            if (Character.isLetter(letra)) {
                contadorLetras++;

                if (contadorLetras == qtdLetras) {
                    System.out.println(letra);
                    break;
                }
            }
        }
    }
}
