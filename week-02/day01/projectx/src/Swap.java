public class Swap {
    public static void main(String[] args) {

        int a = 123;
        int b = 526;
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("A is: " + a + ", b is: "+ b);
    }
}
