import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputgirls = scanner.nextInt();
        int userInputboys = scanner.nextInt ();

        if (userInputgirls == userInputboys && (userInputgirls + userInputboys) > 20)
        {System.out.println("The party is excellent!");
        }

        else if (userInputgirls != userInputboys && (userInputgirls + userInputboys) > 20)
        {System.out.println("Quite cool party");
        }
        else if (userInputgirls + userInputboys < 20 && userInputgirls != 0)
        {System.out.println("Average party");
        }

        else if (userInputgirls == 0)

        {System.out.println("Sausage party");
        }

    }

}
