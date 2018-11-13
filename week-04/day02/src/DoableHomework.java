import java.util.*;

public class DoableHomework {


    public static void main(String[] args) {

        ArrayList<Map<String, Object>> map = new ArrayList<>();

        HashMap<String, Object> hmaprow1 = new HashMap<String, Object>();
        hmaprow1.put("name", "oak");
        hmaprow1.put("color", "brown");
        hmaprow1.put("age", 5);
        hmaprow1.put("sex", "male");
        map.add(hmaprow1);

        HashMap<String, Object> hmaprow2 = new HashMap<String, Object>();
        hmaprow2.put("name", "cherry");
        hmaprow2.put("color", "red");
        hmaprow2.put("age", 13);
        hmaprow2.put("sex", "male");
        map.add(hmaprow2);

        HashMap<String, Object> hmaprow3 = new HashMap<String, Object>();
        hmaprow3.put("name", "apple");
        hmaprow3.put("color", "green");
        hmaprow3.put("age", 2);
        hmaprow3.put("sex", "female");
        map.add(hmaprow3);

        HashMap<String, Object> hmaprow4 = new HashMap<String, Object>();
        hmaprow4.put("name", "peach");
        hmaprow4.put("color", "yellow");
        hmaprow4.put("age", 6);
        hmaprow4.put("sex", "female");
        map.add(hmaprow4);

       // System.out.println(map.get(0));
        if(hmaprow1.containsValue("oak")) {
            System.out.println(hmaprow1.get("age"));
        }
       // System.out.println(map);
       // hmaprow1.
        System.out.println(hmaprow1.values());







    }

}
