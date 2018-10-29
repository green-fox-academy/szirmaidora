import java.util.Scanner;
public class OneTwoALot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput3 = scanner.nextInt();

        if (userInput3 <= 0) {
            System.out.println("Not enough");
        } else if (userInput3 == 1) {
            System.out.println("One");
        } else if (userInput3 == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }

    }

   }




