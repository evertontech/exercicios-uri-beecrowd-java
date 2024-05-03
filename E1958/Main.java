package E1958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String[] vetor = entrada.split("\\.");

        if (entrada.charAt(0) != '-') {

            int expoente = vetor[0].length() - 1;
            String eResposta = String.format("%02d", expoente);

            entrada = entrada.replace(".", "");
            String novoValorString = entrada.charAt(0) + "." + entrada.substring(1, 6);

            Double novoValor = Double.parseDouble(novoValorString);

            String valor = String.format("%.4f", novoValor).replace(",", ".");

            String resposta = "+" + valor + "E+" + eResposta;

            System.out.println(resposta);

        } else { // -0.000027
            entrada = entrada.replace("-", "");

            int expoente = entrada.split("\\.")[1].length() - 1;
            String expoenteString = String.format("%02d", entrada);

            entrada = entrada.replace(".", "");

            int mantissa = Integer.parseInt(entrada);

            entrada = entrada.charAt(0) + "." + entrada.substring(1, 7); // 0.000027 , 1.1

            System.out.println(entrada);

        }
    }
}
