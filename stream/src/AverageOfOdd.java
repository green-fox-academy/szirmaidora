import java.util.Arrays;
import java.util.List;

public class AverageOfOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
   /*     long number = numbers.stream().filter(x -> x % 2 != 0).count();
        numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
        numbers / number;*/
        System.out.println(numbers.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).summaryStatistics().getAverage());
        System.out.println(numbers.stream().filter(x -> x % 2 != 0).mapToInt(i -> i).average());
    }
}
