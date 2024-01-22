package E1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        int total = 0;

        for (int i = 0; i < n; ++i) {
            int quantidadeDeCobaias = scanner.nextInt();
            String entradaDoTipoDeCobaia = scanner.nextLine();

            if (entradaDoTipoDeCobaia.equals("C")) {
                totalCoelhos += quantidadeDeCobaias;
            } else if (entradaDoTipoDeCobaia.equals("S")) {
                totalSapos += quantidadeDeCobaias;
            } else if (entradaDoTipoDeCobaia.equals("R")) {
                totalRatos += quantidadeDeCobaias;
            }
        }

        total = totalCoelhos + totalRatos + totalSapos;

        System.out.println("Total: " + total);
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);

        // Calcula os percentuais
        double percentualCoelhos = (totalCoelhos / total) * 100;
        double percentualRatos = (totalRatos / total) * 100;
        double percentualSapos = (totalSapos / total) * 100;

        System.out.println("Percentual de coelhos: " + percentualCoelhos + "%");
        System.out.println("Percentual de ratos: " + percentualRatos + "%");
        System.out.println("Percentual de sapos: " + percentualSapos + "%");
    }
}