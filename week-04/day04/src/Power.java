public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 6));

    }
    public static int power (int base, int power) {
        if (power == 1) {
            return base;
        } {
            System.out.println(base + " " + power);
            return power(base, power - 1) * base;
        }

    }
}
