package E1131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inter = 0;
        int gremio = 0;
        int empate = 0;
        int n;

        do {
            int golsInter = scanner.nextInt();
            int golsGremio = scanner.nextInt();

            if (golsInter > golsGremio) {
                inter = inter + 1;
            } else if (golsGremio > golsInter) {
                gremio = gremio + 1;
            } else {
                empate = empate + 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            n = scanner.nextInt();

        } while (n != 2);

        int grenais = inter + gremio + empate;

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (inter < gremio) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
