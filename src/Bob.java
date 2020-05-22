import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.print("Say something to Bob: ");
            String userInput = scanner.nextLine().trim();
            System.out.print("You entered: " + userInput + "\n");

            if (userInput.endsWith("?")) {
                System.out.print("Sure\n");
            } else if (userInput.endsWith("!")) {
                System.out.print("Whoa, chill out!\n");
            } else if (userInput.equals("")) {
                System.out.print("Fine, be that way!\n");
            } else {
                System.out.print("Whatever\n");
            }

            System.out.print("Would you like to continue: Yes or No? ");
            answer = scanner.nextLine();


        } while (answer.equalsIgnoreCase("Yes"));
    }
}