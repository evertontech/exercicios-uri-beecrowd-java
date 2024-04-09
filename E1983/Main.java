package E1983;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeAlunos = scanner.nextInt();
        float notaAprovada = 0;
        int matriculaAprovada = 0;
        boolean teveAprovacao = false;

        for (int i = 0; i < quantidadeDeAlunos; ++i) {
            int numeroDeMatricula = scanner.nextInt();
            float notaAluno = scanner.nextFloat();

            if (notaAluno > notaAprovada && notaAluno >= 8) {
                notaAprovada = notaAluno;
                matriculaAprovada = numeroDeMatricula;
                teveAprovacao = true;
            }
        }

        if (teveAprovacao) {
            System.out.println(matriculaAprovada);
        } else {
            System.out.println("Minimum note not reached");
        }
    }
}
