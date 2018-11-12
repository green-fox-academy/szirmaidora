import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void main(String[] args) {
        String lines = "my-file.txt";
        System.out.println(numberOfLines(lines));
    }

    public static int numberOfLines(String filename) {
        int number = 0;
        List<String> liness;
        try {
            Path filePath = Paths.get(filename);
            liness = Files.readAllLines(filePath);
            for (int i = 0; i < liness.size(); i++) {
                number++;
            }
        } catch (Exception e) {
            System.out.println("0");
            e.printStackTrace();
        }

        return number;


    }
}
