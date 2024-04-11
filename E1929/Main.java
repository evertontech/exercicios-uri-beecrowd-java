package E1929;

import java.util.Scanner;

public class Main {
    public static boolean formaTriangulo(int x, int y, int z) {
        return x + y > z && x + z > y && y + z > x;
    }

    public static boolean combinacaoTresEmTres(int a, int b, int c, int d) {
        return formaTriangulo(a, b, c) || formaTriangulo(a, b, d) || formaTriangulo(a, c, d) || formaTriangulo(b, c, d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (combinacaoTresEmTres(a, b, c, d)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
