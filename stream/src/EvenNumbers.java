import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers = numbers.stream().filter(x -> x % 2 == 1 || x % 2 == -1).collect(toList());
        System.out.println(numbers);
    }
}
