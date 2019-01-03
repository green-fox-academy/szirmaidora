import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String start = "Aoihoihio";
        char x = start.charAt(0);
        cities.stream().filter(i -> i.charAt(0) == x || Character.toLowerCase(i.charAt(0)) == x).forEach(System.out::println);
        System.out.println(cities);
    }
}
