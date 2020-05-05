import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String brick = "We don't need no education\nWe don't need no thought control";

        System.out.println(brick);

        String inside = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(inside);
//
        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);
//
        String slashes = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(slashes);


        // Bob
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
        System.out.print("Say something to Bob: ");
        String userInput = scanner.nextLine().trim();
        System.out.print("You entered: " + userInput + "\n");
//
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



        }while (answer.equalsIgnoreCase("Yes"));
    }
}

