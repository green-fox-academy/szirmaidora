import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (c > b) {
            return c;
        }
        return b;
    }

    int median(List<Integer> pool) {
        Collections.sort(pool);
        return pool.get((pool.size() - 1) / 2);
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
    }

    String translate(String teve) {
        List<Character> vowels = new ArrayList<>();
        int length = teve.length();
        for (int i = 0; i <= length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c) && !vowels.contains(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i += 2;
                if (i > length) {
                    length += 2;

                } else {length++;}
                vowels.add(c);


            }

        }
        return teve;
    }
}