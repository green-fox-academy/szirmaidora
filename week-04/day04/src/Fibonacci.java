public class Fibonacci {
    public static void main(String[] args) {
        int myNumber = 6;
        fibonacci(myNumber);
        System.out.println(fibonacci(6));

    }

    public static int fibonacci(int n) {
            if (n == 1 || n == 0) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }

    }

}
