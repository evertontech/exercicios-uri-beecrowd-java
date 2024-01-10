package E1045;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] vetor = {a, b, c};
        Arrays.sort(vetor);
        double ladoC = vetor[0];
        double ladoB = vetor[1];
        double ladoA = vetor[2];

        double quadradoLadoA = Math.pow(ladoA, 2);
        double quadradoLadoB = Math.pow(ladoB, 2);
        double quadradoLadoC = Math.pow(ladoC, 2);

        if (ladoA >= (ladoB + ladoC)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((quadradoLadoA) == (quadradoLadoB + quadradoLadoC)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if ((quadradoLadoA) > (quadradoLadoB + quadradoLadoC)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if ((quadradoLadoA) < (quadradoLadoB + quadradoLadoC)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if ((ladoA == ladoB) && (ladoA == ladoC)) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}


