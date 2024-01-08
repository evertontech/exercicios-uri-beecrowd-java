package E1045;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double ladoA;
        double ladoB;
        double ladoC;

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    ladoA = a;
                    ladoB = b;
                    ladoC = c;
                    // c < b < a
                } else {
                    ladoA = a;
                    ladoB = c;
                    ladoC = b;
                    // b < c < a
                }
            } else {
                ladoA = c;
                ladoB = a;
                ladoC = b;
                // c > a > b
            }
        } else if (b > c) {
            ladoA = b;
            if (a > c) {
                ladoB = a;
                    ladoC = c;
                    // b > a > c
                } else {
                ladoB = c;
                    ladoC = a;
                    // b > c > a
                }
        } else {
            ladoA = c;
            ladoB = b;
            ladoC = a;
            // c > b > a
        }

        double quadradoLadoA = Math.pow(ladoA, 2);
        double quadradoLadoB = Math.pow(ladoB, 2);
        double quadradoLadoC = Math.pow(ladoC, 2);

        int contadorIsosceles = 0;
        int contadorEquilatero = 0;

        if ((ladoA == ladoB) && (ladoA == ladoC)) {
            contadorEquilatero = 1;
        } else if ((ladoA == ladoB) || (ladoA == ladoC)) {
            contadorIsosceles = 1;
        }


        if (ladoA >= (ladoB + ladoC)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((ladoA == ladoB) && (ladoB == ladoC)) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC) && (quadradoLadoA) <= (quadradoLadoB + quadradoLadoC)) {
            System.out.println("TRIANGULO ISOSCELES");
        } else if ((quadradoLadoA) == (quadradoLadoB + quadradoLadoC)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if ((quadradoLadoA) > (quadradoLadoB + quadradoLadoC)) {
            System.out.println("TRIANGULO OBTUSANGULO");
            if (contadorIsosceles == 1) {
                System.out.println("TRIANGULO OBTUSANGULO");
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else if ((quadradoLadoA) < (quadradoLadoB + quadradoLadoC)) {
            if (contadorIsosceles == 1) {
                System.out.println("TRIANGULO ACUTANGULO");
                System.out.println("TRIANGULO ISOSCELES");
            } else if (contadorEquilatero == 1) {
                System.out.println("TRIANGULO ACUTANGULO");
                System.out.println("TRIANGULO EQUILATERO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }
    }
}


