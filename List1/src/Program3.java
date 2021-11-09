public class Program3 {
    public static void main(String[] args) {
        int n = 5;
        int a1 = 1;
        int r = 2;

        int sum = a1;

        for (int i = 2; i <= n; i++) {
            sum += a1 + (i - 1) * r;
        }

        System.out.println(sum);

        System.out.println((2 * a1 + (n - 1) * r) * n / 2);
    }
}
