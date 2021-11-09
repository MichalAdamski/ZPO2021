import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        String message = String.format("Liczba %d %s liczbą doskonałą.", number, isPerfect(number) ? "jest" : "nie jest");

        System.out.println(message);
    }

    private static boolean isPerfect(int number) {
        if (number < 2) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                int d = number / i;
                if (d != i) {
                    sum += d;
                }
            }
        }

        return sum == number;
    }
}
