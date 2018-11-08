import java.util.*;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        // String saturn= "Saturn";
        //  planetList.add(5,saturn);
        //System.out.println(planetList);


        // java.util.ArrayList.add(2,"sfvsf");

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    }

    public static List<String> putSaturn(List<String> myList) {
        myList.add(5, "Saturn");
        return myList;
    }

}