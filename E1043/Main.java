package E1043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            float perimetroTriangulo = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
        } else {
            float areaTrapezio = ((a + b) / 2) * c;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }
    }
}
