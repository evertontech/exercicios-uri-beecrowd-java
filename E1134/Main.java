package E1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorDeEntrada = scanner.nextInt();
        int contadorAlcool = 0;
        int contadorGasolina = 0;
        int contadorDiesel = 0;

        while (valorDeEntrada != 4) {
            valorDeEntrada = scanner.nextInt();

            if (valorDeEntrada == 1) {
                contadorAlcool = contadorAlcool + 1;
            }

            if (valorDeEntrada == 2) {
                contadorGasolina = contadorGasolina + 1;
            }

            if (valorDeEntrada == 3) {
                contadorDiesel = contadorDiesel + 1;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contadorAlcool);
        System.out.println("Gasolina: " + contadorGasolina);
        System.out.println("Diesel: " + contadorDiesel);
    }
}
