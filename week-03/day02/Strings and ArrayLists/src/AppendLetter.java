import java.util.*;
public class AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));}

        public static ArrayList<String> appendA(List<String> list) {
            ArrayList<String> Animals = new ArrayList<>();
            for (int i = 0; i <= list.size()-1; i++){
            Animals.add(list.get(i) + "a");
            }
            return Animals;
        }

        }
               /*
               public static List<String> appendA(List<String> list) {
            List<String> Animals = new ArrayList<>();for (int i = 0; i <list.size(); i++) {
                    StringBuilder sb = new StringBuilder(list.get(i));
                    sb.insert(i, "a");
                    listd.add(sb.toString());

                }
                list = listd;
                return list;
                */


