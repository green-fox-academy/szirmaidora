import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput4 = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
        System.out.println(i + " * " + userInput4 + " = " +  userInput4 * i);
        }
    }
}

