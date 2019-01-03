import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SquaredValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(numbers.stream().filter(x -> x > 0).map(x -> x * x).collect(toList()));
    }
}
