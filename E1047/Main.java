package E1047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();
        int totalMinutosInicial = (horaInicial * 60) + minutoInicial;
        int totalMinutosFinais = (horaFinal * 60) + minutoFinal;
        int duracaoJogoEmMinutos;

        if (totalMinutosInicial < totalMinutosFinais) {
            duracaoJogoEmMinutos = totalMinutosFinais - totalMinutosInicial;
        } else {
            duracaoJogoEmMinutos = (24 * 60) - totalMinutosInicial + totalMinutosFinais;
        }

        int duracaoJogoEmHoras = duracaoJogoEmMinutos / 60;
        duracaoJogoEmMinutos = duracaoJogoEmMinutos % 60;

        System.out.println("O JOGO DUROU " + duracaoJogoEmHoras +  " HORA(S) E "+ duracaoJogoEmMinutos + " MINUTO(S)");
    }
}



