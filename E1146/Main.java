package E1146;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;

        while (true) {
            x = scanner.nextInt();

            if (x == 0) break;

            System.out.println(IntStream.rangeClosed(1, x)
                    .mapToObj(Integer::toString)
                    .collect(Collectors.joining(" ")));
        }
    }
}