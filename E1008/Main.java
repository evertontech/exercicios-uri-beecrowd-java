package E1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDoFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        float valorPorHora = scanner.nextFloat();
        float calculoSalario = horasTrabalhadas * valorPorHora;
        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", calculoSalario);
    }
}
