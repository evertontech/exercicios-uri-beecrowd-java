package E1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeEntrada;
        int contadorAlcool = 0;
        int contadorGasolina = 0;
        int contadorDiesel = 0;

        do {
            quantidadeDeEntrada = scanner.nextInt();

            if (quantidadeDeEntrada == 1) {
                contadorAlcool = contadorAlcool + 1;
            }

            if (quantidadeDeEntrada == 2) {
                contadorGasolina = contadorGasolina + 1;
            }

            if (quantidadeDeEntrada == 3) {
                contadorDiesel = contadorDiesel + 1;
            }

        } while (quantidadeDeEntrada != 4);


        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contadorAlcool);
        System.out.println("Gasolina: " + contadorGasolina);
        System.out.println("Diesel: " + contadorDiesel);
    }
}
