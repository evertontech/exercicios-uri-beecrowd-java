package E1045;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float ladoA;
        float ladoB;
        float ladoC;

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
                if (a > c) {
                    ladoA = b;
                    ladoB = a;
                    ladoC = c;
                    // b > a > c
                } else {
                    ladoA = b;
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

        if (ladoA >= (ladoB + ladoC)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((quadradoLadoA) == (quadradoLadoB + quadradoLadoC)){
            System.out.println("TRIANGULO RETANGULO");
        } else if ((quadradoLadoA) > (quadradoLadoB + quadradoLadoC) && ((ladoA > ladoB) && (ladoB > ladoC))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((quadradoLadoA) < (quadradoLadoB + quadradoLadoC)) {
            System.out.println("TRIANGULO ACUTANGULO");
        } else if ((ladoA == ladoB) && (ladoB == ladoC)) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC) && (quadradoLadoA) <= (quadradoLadoB + quadradoLadoC)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}


