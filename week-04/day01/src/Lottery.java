import java.io.IOException;
import java.text.CollationElementIterator;
import java.util.List;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;

public class Lottery {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        Path path = Paths.get("lottery.txt");
        mostFrequentNumbers(path);

    }

    public static List<String> mostFrequentNumbers(Path p) {
        List<String> numbers = new ArrayList<String>();
        try {
            numbers = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> numbersString = new ArrayList<>();

        String row = "";

        int [] [] frequency = new int [90] [2];
        for (int i = 0; i < frequency.length-1; i++) {
            frequency[i][0] = i + 1;

        }

        for (int i = 0; i < numbers.size(); i++) {
            row = numbers.get(i);
            for (int j = 11; j < 16; j++) {
                numbersString.add(row.split(";")[j]);

            }
        }
        List<Integer> numbersInt = new ArrayList<>();

        for (int i = 0; i < numbersString.size(); i++) {

            numbersInt.add(Integer.parseInt(numbersString.get(i)));
            System.out.println(numbersInt.get(i));


        }
        for (int i = 0; i < numbersInt.size(); i++) {
            for (int j = 0; j < 90; j++) {
                if (numbersInt.get(i) == j){
                    frequency[j][1] += 1;

                }

            }

        }
        List <Integer> numberofEl = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            numberofEl.add(frequency [i] [1]);


        }


        System.out.println(Collections.max(numberofEl));
        System.out.println();
        for (int i = 0; i < frequency.length; i++) {

           // System.out.println((frequency[i][0])+1 + " " +  frequency[i][1]);
        }



       // System.out.println(numbersString);
        return numbersString;
    }
}