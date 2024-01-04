package E1040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();

        float media = (a * 2 + b * 3 + c * 4 + d * 1) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno aprovado.\n");
        } else if (media < 5) {
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno reprovado.\n");
        } else if (media >= 5.0 || media <= 6.9){
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno em exame.\n");
            float notaExame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            float exame = (notaExame + media) / 2;
            if (exame >= 5.0) {
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", exame);
            } else {
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n", exame);
            }
        }


    }
}
