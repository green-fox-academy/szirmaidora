public class Counter {
    public static void main(String[] args) {
        System.out.println(countBack(5));

    }
    public static int countBack (int n) {
        if (n == 0) {
            return 0;
        }
        {
            System.out.println(n);
            return countBack(n-1);

        }
    }
}
