package E1050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ddd = scanner.nextInt();
        String cidade = switch (ddd) {
            case 11 -> "Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            case 32 -> "Juiz de Fora";
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 19 -> "Campinas";
            default -> "DDD nao cadastrado";
        };

        System.out.println(cidade);
    }
}
