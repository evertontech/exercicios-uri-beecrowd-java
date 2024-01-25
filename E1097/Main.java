package E1097;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i = i + 2) {
            for (int j = i + 6; j >= i + 4; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}
