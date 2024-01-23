package E1160;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int diferencaPopulacao;
        double diferencaTaxas;
        double taxaCrescimento;
        double crescimentoAnual;
        double tempoParaUltrapassar;

        for (int i = 0; i < t; ++i) {
            int populacaoA = scanner.nextInt();
            int populacaoB = scanner.nextInt();
            double taxaA = scanner.nextDouble();
            double taxaB = scanner.nextDouble();

            diferencaPopulacao = populacaoB - populacaoA;
            diferencaTaxas = taxaB - taxaA;
            taxaCrescimento = diferencaPopulacao * (diferencaTaxas / 100);
            crescimentoAnual = (taxaCrescimento * 100) / diferencaPopulacao;
            tempoParaUltrapassar = (diferencaPopulacao / crescimentoAnual) + crescimentoAnual;

            if (tempoParaUltrapassar > 100) {
                System.out.println("Mais de 1 seculo.");
                break;
            } else {
                System.out.println(tempoParaUltrapassar + "anos.");
            }
        }

    }
}
