package E1060;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int i;

        for (i = 1; i <= 6; ++i){
            float valor = scanner.nextFloat();
            if (valor > 0) {
                contador = contador + 1;
            }
        }

        System.out.printf("%d valores positivos\n", contador);
    }
}
