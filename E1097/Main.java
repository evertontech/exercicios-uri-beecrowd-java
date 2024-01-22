package E1097;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (i = 1, j = 7; i <= 9; i = i + 2, j = j + 2) {
            System.out.println("I=" + i + " J=" + (j));
            System.out.println("I=" + i + " J=" + (j - 1));
            System.out.println("I=" + i + " J=" + (j - 2));
        }
    }
}
