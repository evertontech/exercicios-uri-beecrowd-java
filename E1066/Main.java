package E1066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valoresDeEntrada;
        int contadorImpares = 0;
        int contadorNegativoPares = 0;
        int contadorPositivoPares = 0;
        int contadorNegativoImpares = 0;
        int contadorPositivoImpares = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        int contadorPares = 0;

        for (int i = 1; i <= 5; ++i) {
            valoresDeEntrada = scanner.nextInt();
            if (valoresDeEntrada % 2 == 0) {
                if (valoresDeEntrada > 0) {
                    contadorPositivoPares = contadorPositivoPares + 1;
                    contadorPares = contadorPares + 1;
                } else if (valoresDeEntrada < 0) {
                    contadorNegativoPares = contadorNegativoPares + 1;
                    contadorPares = contadorPares + 1;
                } else {
                    contadorPares = contadorPares + 1;
                }
            } else if (valoresDeEntrada > 0) {
                contadorPositivoImpares = contadorPositivoImpares + 1;
                contadorImpares = contadorImpares + 1;
            } else if (valoresDeEntrada < 0){
                contadorNegativoImpares = contadorNegativoImpares + 1;
                contadorImpares = contadorImpares + 1;
            } else {
                contadorImpares = contadorImpares + 1;
            }
        }

        contadorPositivo = contadorPositivoImpares + contadorPositivoPares;
        contadorNegativo = contadorNegativoImpares + contadorNegativoPares;

        System.out.println(contadorPares + " valor(es) par(es)");
        System.out.println(contadorImpares + " valor(es) impar(es)");
        System.out.println(contadorPositivo + " valor(es) positivo(s)");
        System.out.println(contadorNegativo + " valor(es) negativo(s)");

    }
}
