import java.util.Arrays;
import java.util.List;

public class SumOfOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println(numbers.stream().filter(x -> x % 2 != 0).mapToInt(i -> i.intValue()).sum());
    }
}
