package E1021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();
        float quantidadeDeNotas;

        quantidadeDeNotas = valor / 100;
        valor = valor - (quantidadeDeNotas * 100);
        System.out.println(valor);
    }
}
