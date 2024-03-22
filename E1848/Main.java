package E1848;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; ++i) {
            int numeroSorteado = 0;

            while (true) {

                String entrada = scanner.nextLine();

                if (entrada.equals("caw caw")) {
                    System.out.println(numeroSorteado);
                    break;

                } else {
                    int contador = 0;

                    if (entrada.charAt(0) == '*') {
                        contador += 4;
                    }

                    if (entrada.charAt(1) == '*') {
                        contador += 2;
                    }

                    if (entrada.charAt(2) == '*') {
                        contador += 1;
                    }

                    numeroSorteado += contador;
                }
            }
        }
    }
}
