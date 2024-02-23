package E1061;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linha1 = scanner.nextLine();
        String linha2 = scanner.nextLine();
        String linha3 = scanner.nextLine();
        String linha4 = scanner.nextLine();

        String[] valoresLinha1 = linha1.split(" ");
        int diaInicio = Integer.parseInt(valoresLinha1[1]);

        String[] valoresLinha2 = linha2.split(" : ");
        int horasInicio = Integer.parseInt(valoresLinha2[0]);
        int minutosInicio = Integer.parseInt(valoresLinha2[1]);
        int segundosInicio = Integer.parseInt(valoresLinha2[2]);

        String[] valoresLinha3 = linha3.split(" ");
        int diaFim = Integer.parseInt(valoresLinha3[1]);

        String[] valoresLinha4 = linha4.split(" : ");
        int horasFinal = Integer.parseInt(valoresLinha4[0]);
        int minutosFinal = Integer.parseInt(valoresLinha4[1]);
        int segundosFinal = Integer.parseInt(valoresLinha4[2]);

        LocalDate dataInicio = LocalDate.of(2024, 4, diaInicio);
        LocalTime horarioInicio = LocalTime.of(horasInicio, minutosInicio, segundosInicio);
        LocalDateTime momentoInicial = LocalDateTime.of(dataInicio, horarioInicio);

        LocalDate dataFinal = LocalDate.of(2024, 4, diaFim);
        LocalTime horarioFinal = LocalTime.of(horasFinal, minutosFinal, segundosFinal);
        LocalDateTime momentoFinal = LocalDateTime.of(dataFinal, horarioFinal);

        Duration duracao = Duration.between(momentoInicial, momentoFinal);

        long dias = duracao.toDaysPart();
        long horas = duracao.toHoursPart();
        long minutos = duracao.toMinutesPart();
        long segundos = duracao.toSecondsPart();

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
