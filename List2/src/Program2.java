import java.util.Scanner;

public class Program2 {

    private static final int r = 25;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.printf("Podaj napięcie w woltach: ");
            int u = scanner.nextInt();

            System.out.printf("Podaj liczbę rezystorów: ");
            int n = scanner.nextInt();

            System.out.printf("Prąd w układzie jest równy %.2fA", calculateCurrent(n, u));
        }
    }

    private static double calculateCurrent(int n, int u) {
        return n * u / (double) r;
    }
}
