public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(12345));

    }
    public static int sumDigit (int n) {
        if (n / 10 < 1) {
            return n;
        }
        {
            System.out.println(n);
            return sumDigit(n / 10) + n % 10;
        }

    }
}
