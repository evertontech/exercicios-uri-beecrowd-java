package E1095;

public class Main {
    public static void main(String[] args) {
        int i;
        int j;

        for (i = 1, j = 60; j >= 0; i = i + 3, j = j - 5) {
            System.out.printf("I=%d J=%d\n", i, j);
        }
    }
}
