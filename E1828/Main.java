package E1828;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= t; ++i) {

            String[] entrada = scanner.nextLine().split(" ");
            String jokenPoh1 = entrada[0];
            String jokenPoh2 = entrada[1];

            switch(jokenPoh1) {
                case "Spock": switch(jokenPoh2) {
                    case "tesoura", "pedra": System.out.println("Caso #" + i + ": Bazinga!"); break;
                    case "lagarto", "papel": System.out.println("Caso #" + i + ": Raj trapaceou!"); break;
                } break;

                case "tesoura": switch(jokenPoh2) {
                    case "papel", "lagarto": System.out.println("Caso #" + i + ": Bazinga!"); break;
                    case "Spock", "pedra": System.out.println("Caso #" + i + ": Raj trapaceou!"); break;
                } break;

                case "pedra": switch(jokenPoh2) {
                    case "lagarto", "tesoura": System.out.println("Caso #" + i + ": Bazinga!"); break;
                    case "papel", "Spock": System.out.println("Caso #" + i + ": Raj trapaceou!"); break;
                } break;

                case "lagarto": switch(jokenPoh2) {
                    case "Spock", "papel": System.out.println("Caso #" + i + ": Bazinga!"); break;
                    case "pedra", "tesoura": System.out.println("Caso #" + i + ": Raj trapaceou!"); break;
                } break;

                case "papel": switch(jokenPoh2) {
                    case "Spock", "pedra": System.out.println("Caso #" + i + ": Bazinga!"); break;
                    case "tesoura", "lagarto": System.out.println("Caso #" + i + ": Raj trapaceou!"); break;
                } break;
            }

            if (jokenPoh1.equals(jokenPoh2)) {
                System.out.println("Caso #" + i + ": De novo!");
            }
        }
    }
}
