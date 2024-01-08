package E1047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int minutoFinal = scanner.nextInt();
        int totalHorasInicial;
        int totalHorasFinais;
        int totalMinutos;
        int totalHoras;
        int resto;

//        if (horaInicial == horaFinal) {
//
//        }

        totalHorasInicial = (horaInicial * 60) + minutoInicial;
        totalHorasFinais = (horaFinal * 60) + minutoFinal;
        totalMinutos = totalHorasFinais - totalHorasInicial;
//        resto = totalMinutos / 60; // 122 % 60
//        totalHoras = (totalMinutos - resto) / 60;
        System.out.println(totalMinutos);
        //System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalHoras, totalMinutos);



    }
}

