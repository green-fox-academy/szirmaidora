public class Sum {
    public static void main(String[] args) {
        int i = 8;
        sum (i);
    }
    public static void sum (int part) {
        int part2 = 0;
        for (int a=0; a <= part; a++) {
           part2 = a + part2;
        }
        System.out.println(part2);
    }
}
