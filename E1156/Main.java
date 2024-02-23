package E1156;

public class Main {
    public static void main(String[] args) {
        double s = 1;
        double numeroDobro = 2;

        for (int i = 3; i < 39; i = i + 2) {
            s = s + i / numeroDobro;
            numeroDobro = numeroDobro * 2;
        }

        System.out.printf("%.2f\n", s);
    }
}
