package E1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 0; i < n; ++i) {
            int quantidadeDeCobaias = scanner.nextInt();
            String entradaDoTipoDeCobaia = scanner.nextLine().trim();

            switch (entradaDoTipoDeCobaia) {
                case "C":
                case "c":
                    totalCoelhos += quantidadeDeCobaias;
                    break;
                case "S":
                case "s":
                    totalSapos += quantidadeDeCobaias;
                    break;
                case "R":
                case "r":
                    totalRatos += quantidadeDeCobaias;
                    break;
            }
        }

        int total = totalCoelhos + totalRatos + totalSapos;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);

        // Calcula os percentuais
        double percentualCoelhos = (double) totalCoelhos / total * 100;
        double percentualRatos = (double) totalRatos / total * 100;
        double percentualSapos = (double) totalSapos / total * 100;

        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
    }
}