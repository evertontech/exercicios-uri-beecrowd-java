package E1095;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (i = 1, j = 60; i <= 39; i = i + 3, j = j - 5) {
            System.out.printf("I=%d J=%d\n", i, j);
        }

    }
}
