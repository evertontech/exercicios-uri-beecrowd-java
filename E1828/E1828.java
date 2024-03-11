package E1828;

import java.util.Scanner;

public class E1828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; ++i) {
            String jokenPoh1 = scanner.nextLine();
            String jokenPoh2 = scanner.nextLine();

            if (jokenPoh1.equals("Spock") && jokenPoh2.equals("Spock") || jokenPoh1.equals("tesoura") && jokenPoh2.equals("tesoura") || jokenPoh1.equals("papel") && jokenPoh2.equals("papel") || jokenPoh1.equals("pedra") && jokenPoh2.equals("pedra") || jokenPoh1.equals("lagarto") && jokenPoh2.equals("lagarto")) {
                System.out.println("Caso #" + i + ": De novo!");
            }

            if (jokenPoh1.equals("tesoura") && jokenPoh2.equals("papel") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("papel") && jokenPoh2.equals("pedra") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("pedra") && jokenPoh2.equals("lagarto") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("lagarto") && jokenPoh2.equals("Spock") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("Spock") && jokenPoh2.equals("tesoura") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("tesoura") && jokenPoh2.equals("lagarto") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("lagarto") && jokenPoh2.equals("papel") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("papel") && jokenPoh2.equals("Spock") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("Spock") && jokenPoh2.equals("pedra") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("pedra") && jokenPoh2.equals("tesoura") ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }

            if (jokenPoh1.equals("papel") && jokenPoh2.equals("tesoura") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("pedra") && jokenPoh2.equals("papel") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("lagarto") && jokenPoh2.equals("pedra") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("Spock") && jokenPoh2.equals("lagarto") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("tesoura") && jokenPoh2.equals("Spock") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("lagarto") && jokenPoh2.equals("tesoura") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("papel") && jokenPoh2.equals("lagarto") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("Spock") && jokenPoh2.equals("papel") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("pedra") && jokenPoh2.equals("Spock") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

            if (jokenPoh1.equals("tesoura") && jokenPoh2.equals("pedra") ) {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

        }
    }
}
