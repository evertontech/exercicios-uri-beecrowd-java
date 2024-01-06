package E1042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                if (b > c){
                    System.out.println(c);
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println();
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println();
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
            } else {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
                System.out.println();
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        } else if (b > c) {
                if (a > c) {
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println();
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                    System.out.println();
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
        } else {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
