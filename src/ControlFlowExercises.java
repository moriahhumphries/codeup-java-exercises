import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("You entered: " + userNumber + "\n");
        System.out.print("Here is your table!\nnumber | squared | cubed\n");

        for (int i = 1; i <= userNumber; i++) {
                int squared = i * i;
                int cubed = i * squared;
                System.out.print(i + "\t" + "\t" + "\t" + squared + "\t" + "\t" + "\t" + cubed + "\n");
        }
        System.out.print("Would you like to continue: Yes or No? ");
        String answer = scanner.nextLine();
        boolean yes = true;
        boolean no = false;

        if (answer.equals("yes") || answer.equals("Yes")) {
            System.out.print("Continuing!");
        } else {
            System.out.print("Program Finished.");
        }
    }
}
