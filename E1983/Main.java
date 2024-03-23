package E1983;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeAlunos = scanner.nextInt();
        float aprovado = 0;
        int matriculaAprovada = 0;
        int contadorAprovado = 0;

        for (int i = 0; i < quantidadeDeAlunos; ++i) {
            int numeroDeMatricula = scanner.nextInt();
            float notaAluno = scanner.nextFloat();

            if (notaAluno > aprovado && notaAluno >= 8) {
                aprovado = notaAluno;
                matriculaAprovada = numeroDeMatricula;
                contadorAprovado++;

            }
        }

        if (contadorAprovado > 0) {
            System.out.println(matriculaAprovada);
        } else {
            System.out.println("Minimum note not reached");
        }
    }
}
