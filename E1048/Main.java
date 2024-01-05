package E1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salario = scanner.nextFloat();
        double novoSalario;
        double reajuste;
        if (salario >= 0 && salario <= 400.00) {
            novoSalario = salario + (salario * 0.15);
            reajuste = salario * 0.15;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %s\n", "15 %");
        } else if (salario >= 400.01 && salario <= 800.00) {
                    novoSalario = salario + (salario * 0.12);
                    reajuste = salario * 0.12;
                    System.out.printf("Novo salario: %.2f\n", novoSalario);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                    System.out.printf("Em percentual: %s\n", "12 %");
        } else if (salario >= 800.00 && salario <= 1200.00) {
                    novoSalario = salario + (salario * 0.10);
                    reajuste = salario * 0.10;
                    System.out.printf("Novo salario: %.2f\n", novoSalario);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                    System.out.printf("Em percentual: %s\n", "10 %");
        } else if (salario >= 1200.01 && salario <= 2000.00){
                    novoSalario = salario + (salario * 0.07);
                    reajuste = salario * 0.07;
                    System.out.printf("Novo salario: %.2f\n", novoSalario);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                    System.out.printf("Em percentual: %s\n", "7 %");
        } else if (salario >= 2000.00) {
                    novoSalario = salario + (salario * 0.04);
                    reajuste = salario * 0.04;
                    System.out.printf("Novo salario: %.2f\n", novoSalario);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                    System.out.printf("Em percentual: %s\n", "4 %");
        }
    }
}
