import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String answer = "";
            do {
            System.out.print("Enter a numerical grade from 0 - 100: ");
            int userGrade = Integer.parseInt(scanner.nextLine());
            System.out.print("You entered: " + userGrade + "\n");

            if (userGrade >= 88) {
                System.out.print("You got an A!\n");
            } else if (userGrade >= 80) {
                System.out.print("You got a B!\n");
            } else if (userGrade >= 67) {
                System.out.print("You got a C.\n");
            } else if (userGrade >= 60) {
                System.out.print("Well, you got a D.\n");
            } else {
                System.out.print("It's an F, sorry bud.\n");
            }

            System.out.print("Would you like to continue: Yes or No? ");
           answer = scanner.nextLine();

            } while (answer.equalsIgnoreCase("Yes"));

    }
}
