package E1045;

import java.util.Arrays;
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

        double[] vetor = {a, b, c};
        Arrays.sort(vetor);
        ladoC = vetor[0];
        ladoB = vetor[1];
        ladoA = vetor[2];

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


