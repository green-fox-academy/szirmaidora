import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput5 = scanner.nextInt();
        int userInput6 = scanner.nextInt();
        if (userInput6 <= userInput5) {
            System.out.println("The second number should be bigger");
        }
        else {
            while (userInput5 < userInput6)  {
                userInput5++;
                System.out.println(userInput5);
            }
        }
        }
    }

