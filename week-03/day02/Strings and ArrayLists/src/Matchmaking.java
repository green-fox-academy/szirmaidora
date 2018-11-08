import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static List<String> makingMatches(List<String> list1, List<String> list2) {
        List<String> listx = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            listx.add(list1.get(i));
            listx.add(list2.get(i));
        }
        return listx;
    }
    }





