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

            switch (quantidadeDeEntrada) {
                case 1:
                    contadorAlcool++;
                    break;
                case 2:
                    contadorGasolina++;
                    break;
                case 3:
                    contadorDiesel++;
                    break;
            }

        } while (quantidadeDeEntrada != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contadorAlcool);
        System.out.println("Gasolina: " + contadorGasolina);
        System.out.println("Diesel: " + contadorDiesel);
    }
}
