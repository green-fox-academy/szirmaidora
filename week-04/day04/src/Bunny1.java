public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(20));

    }

    public static int bunnyEars(int bunnies) {

        if (bunnies == 0) {
            return bunnies;
        }
        {
            System.out.println(bunnies);
            return bunnyEars(bunnies - 1) + 2;
        }
    }
}
