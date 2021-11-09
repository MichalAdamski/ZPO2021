import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Podaj liczbę kolumn: ");
            int m = scanner.nextInt();

            System.out.printf("Podaj liczbę wierszy: ");
            int n = scanner.nextInt();

            printRectangle(m, n);
        }
    }

    private static void printRectangle(int m, int n){
        System.out.println(getAsteriskRectangle(m, n));
    }

    private static String getAsteriskRectangle(int m, int n) {
        String row = "";
        String rectangle = "";

        for (int i = 0; i < m; i++) {
            row += "*";
        }

        for (int i = 0; i < n; i++) {
            rectangle += row + "\n";
        }

        return rectangle;
    }
}
