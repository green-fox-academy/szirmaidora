public class Factorio {
    public static void main(String[] args) {
        int d = 4;
        factorio (d);
    }
    public static void factorio (int facto) {
        int part2=1;
        for (int a=1; a <= facto; a++) {
            part2 = a * part2;
        }
        System.out.println(part2);
    }

}
