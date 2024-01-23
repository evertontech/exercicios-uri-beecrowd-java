package E1096;

public class Main {
    public static void main(String[] args) {

        for (int i = 1, j = 7; i <= 9; i = i + 2) {
            System.out.println("I=" + i + " J=" + j);
            System.out.println("I=" + i + " J=" + (j - 1));
            System.out.println("I=" + i + " J=" + (j - 2));
        }
    }
}
