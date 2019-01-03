import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterListToString {
    public static void main(String[] args) {
        List<Character> myList = Arrays.asList('a','a','b','d');
        StringBuilder stringBuilder = new StringBuilder();
        myList.stream().forEach(stringBuilder::append);
        System.out.println(stringBuilder);
//Peti megoldasa:
            String result = "";
    result = myList.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(result);
    }
}
