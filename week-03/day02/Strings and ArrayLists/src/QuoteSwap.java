import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }
    public static String quoteSwap(ArrayList<String> poem) {
        Collections.swap(poem, 2, 5);
        String str = "";
        for (String i: poem) {
            str += i + " ";
        }
        return str;
    }

   /*public static void quoteSwap(ArrayList<String> poem) {
       String a = "";
       for (int i = 0; i < poem.size(); i++) {
           a = a + poem.get(i) + " ";
       }
       System.out.println(a);
       }


       public static ArrayList<String> quoteSwap(ArrayList<String> poem) {
           Collections.swap(poem, 2, 5);
           ArrayList<String> str = new ArrayList<>();
           for (int i = 0; i < poem.size(); i++) {
               str.add(poem.get(i) + " ");
           }
           return str;*/
}