package question05;

public class Multiplication {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%dx%d=%d", i, j, i * j);
                if (j < 10) System.out.print(", ");
                else System.out.print(";");
            }
            System.out.print("\n");

        }
    }
}
