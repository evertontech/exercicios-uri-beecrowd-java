package E1541;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int lado1 = scanner.nextInt();

            if (lado1 == 0) {
                break;
            }

            int lado2 = scanner.nextInt();
            int porcentagemPermitadaParaConstruir = scanner.nextInt();
            int areaConstruida = lado1 * lado2;

            int areaDoTerreno = (100 * areaConstruida) / porcentagemPermitadaParaConstruir;

            int ladoDoTerreno = (int) Math.sqrt(areaDoTerreno);

            System.out.println(ladoDoTerreno);
        }
    }
}
