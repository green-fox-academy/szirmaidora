import java.util.Arrays;
public class numList {
    public static void main(String[] args) {
        int numlist [] = {3, 4, 5, 6, 7};
        for (int i = 0; i < numlist.length; i++) {
            numlist [i] = numlist[i]*2;}
        System.out.println(Arrays.toString(numlist));
    }


}
