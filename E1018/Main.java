package E1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = new Scanner(System.in).nextInt();
        int quantidadeDeNotas;
        int[] valoresDeNotas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        for (int i = 0; i < 7; ++i){
            quantidadeDeNotas = valor / valoresDeNotas[i];
            valor = valor - (quantidadeDeNotas * valoresDeNotas[i]);
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeDeNotas, valoresDeNotas[i]);
        }
    }
}
