import java.util.ArrayList;
import java.util.List;

public class FoxStream {
    public static void main(String[] args) {
        List<Fox> foxList = new ArrayList<>();
        Fox fox1 = new Fox("Vuk", "red", 0);
        Fox fox2 = new Fox("Karak", "orange", 5);
        foxList.add(fox1);
        foxList.add(fox2);
    }
}
