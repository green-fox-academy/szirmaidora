public class Bunny2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(10));

    }

    public static int bunnyEars(int bunnies) {

        if (bunnies == 0) {
            return bunnies;
        }
        {
            if (bunnies % 2 == 0) {
                return bunnyEars(bunnies - 1) + 2;
            }
            {
                return bunnyEars(bunnies - 1) + 3;
            }

        }
    }
}

