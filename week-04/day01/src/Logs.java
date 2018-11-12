import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        String log = "log.txt";


        Path filePath = Paths.get(log);
        List<String> contentIp = new ArrayList();
        List<String> contentGetPost = new ArrayList();
        try {
            List<String> logAr = new ArrayList();
            logAr = Files.readAllLines(filePath);
            for (int i = 0; i < logAr.size(); i++) {
                if (!contentIp.contains(logAr.get(i).split("\\s+")[5])) {
                    contentIp.add(logAr.get(i).split("\\s+")[5]);
                }
                contentGetPost.add(logAr.get(i).split("\\s+")[6]);
            }
            /*double occurrences = Collections.frequency(contentGetPost, "GET");
            double occurrences2 = Collections.frequency(contentGetPost, "POST");
            System.out.println(occurrences2/occurrences);
            double occurrencesGet = Collections.frequency(contentGetPost, "GET");
            double occurrencesPost = Collections.frequency(contentGetPost, "POST");*/
            double occurrencesGet = 0;
            double occurrencesPost = 0;
            for (int i = 0; i < contentGetPost.size(); i++) {
                if (contentGetPost.get(i).equals("GET")){
                    occurrencesGet++;
                }
                else if (contentGetPost.get(i).equals("POST")) {
                    occurrencesPost++;
                }

            }
            System.out.println(occurrencesPost + ":" + occurrencesGet + "=" + occurrencesPost/occurrencesGet);


        } catch (IOException e) {
            System.out.println("whoops");
        }

        System.out.println(contentIp);
    }
}