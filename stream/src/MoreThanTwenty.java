import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MoreThanTwenty {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers = numbers.stream().map(x -> x * x).filter(x -> x > 20).collect(toList());
        System.out.println(numbers);

        //Peti jo megoldasa:
        numbers.stream().filter(x -> x * x > 20).collect(toList());
    }
}
