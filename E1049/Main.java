package E1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();
        String palavra3 = scanner.nextLine();

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else if (palavra3.equals("onivoro")) {
                System.out.println("homem");
            } else {
                System.out.println("vaca");
            }

        } else if (palavra2.equals("inseto")) {
                    if (palavra3.equals("hematofago")) {
                        System.out.println("pulga");
                    } else {
                        System.out.println("lagarta");
                    }
        } else if (palavra2.equals("anelideo")) {
                    if (palavra3.equals("hematofago")) {
                        System.out.println("sanguessuga");
                    } else {
                        System.out.println("minhoca");
                    }
        }

    }
}



