package E1155;

public class Main {
    public static void main(String[] args) {
        float s = 1;

        for (int i = 2; i <= 100; ++i) {
            s = s + (1.f / i);
        }

        System.out.printf("%.2f\n", s);
    }
}
