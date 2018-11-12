import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteMultipleLines {

    // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
    public static void main(String[] args) {
        String path1 = "my-file.txt";
        String string1 = "apple";
        int number1 = 5;

        WriteMultiple(path1, string1, number1);

    }

    public static void WriteMultiple(String path, String word, int number) {
        List<String> lines;
        List<String> temp = new ArrayList();
        // temp.add("");
        try {
            Path pathx = Paths.get(path);
            for (int i = 0; i < number; i++) {
                temp.add(i, word);
            }
            Files.write(pathx, temp);
            lines = Files.readAllLines(pathx);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
