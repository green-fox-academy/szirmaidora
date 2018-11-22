import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {

    }
    public int sumOfElements (List<Integer> toSum)  {
        int sum = 0;
        for (int i = 0; i < toSum.size(); i++) {
            sum += toSum.get(i);
        }
        return sum;
    }

}
