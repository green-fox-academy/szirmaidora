import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {
        String original = "my-file.txt";
        String copied = "copy111.txt";
        System.out.println(Copy(original, copied));

    }
    public static boolean Copy (String file1, String file2){
        List<String> temp1 = new ArrayList();
        List<String> temp2 = new ArrayList();
        boolean toReturn = true;
        try {
            Path path1 = Paths.get(file1);
            temp1 = Files.readAllLines(path1);
           /* for (int i = 0; i < temp1.size(); i++) {
                temp2.add(i, temp1.get(i));
            }*/
            Path path2 = Paths.get(file2);
            Files.write(path2, temp2);
            return toReturn;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
