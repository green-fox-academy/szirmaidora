import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        String given = "aaabbbbbkkkttttr";
        Map<Character, Long> frequency =
                given.chars().
                        filter(x -> x == 'b')
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);
    }
}