package E2003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String entrada = scanner.nextLine();

            int hora = Integer.parseInt(entrada.split(":")[0]);

            int minutos = Integer.parseInt(entrada.split(":")[1]);

            int minutosAtrasados = 0;

            if (hora < 7) {
                int atraso = 0;

            } else if (hora == 7) {
                minutosAtrasados = minutos;

            } else {
                minutosAtrasados = (hora - 7) * 60 + minutos;
            }

            System.out.println("Atraso maximo: " + minutosAtrasados);
        }
    }
}
