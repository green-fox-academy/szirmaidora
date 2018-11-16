public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberAdder(5));

    }

    public static int numberAdder(int n) {

        if (n == 0) {
            return n;
        }
        {
            System.out.println(n);
            return numberAdder(n-1) + n;


        }
    }
}

