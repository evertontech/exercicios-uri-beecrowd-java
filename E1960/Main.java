package E1960;


import java.util.Scanner;

public class Main {

    public static void escrever(String caractere, int quantidade) {

        for (int i = 0; i < quantidade; ++i) {
            System.out.print(caractere);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int _cm = n / 900;
        escrever("CM", _cm);
        n %= 900;

        int _d = n / 500;
        escrever("D", _d);
        n %= 500;

        int _cd = n / 400;
        escrever("CD", _cd);
        n %= 400;

        int _c = n / 100;
        escrever("C", _c);
        n %= 100;

        int _xc = n / 90;
        escrever("XC", _xc);
        n %= 90;

        int _l = n / 50;
        escrever("L", _l);
        n %= 50;

        int _xl = n / 40;
        escrever("XL", _xl);
        n %= 40;

        int _x = n / 10;
        escrever("X", _x);
        n %= 10;

        int _ix = n / 9;
        escrever("IX", _ix);
        n %= 9;

        int _v = n / 5;
        escrever("V", _v);
        n %= 5;

        int _iv = n / 4;
        escrever("IV", _iv);
        n %= 4;

        int _i = n;
        escrever("I", _i);

        System.out.println();
    }
}
