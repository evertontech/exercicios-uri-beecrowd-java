package E1036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double quadradoDeB = Math.pow(b, 2);
        double delta = quadradoDeB - 4 * a * c;
        double raizDelta = Math.sqrt(delta);
        if (a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (- b + raizDelta) / (2 * a);
            double r2 = (- b - raizDelta) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}
