package E1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salario = scanner.nextFloat();
        int percentual = 0;

        if (salario >= 0 && salario <= 400.00) {
            percentual = 15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            percentual = 12;
        } else if (salario >= 800.00 && salario <= 1200.00) {
            percentual = 10;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 7;
        } else if (salario >= 2000.00) {
            percentual = 4;
        }

        double reajuste = salario * (percentual / 100.00);
        double novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
    }
}
