import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNumber = scanner.nextInt();
        System.out.print("You entered: " + userNumber + "\n");
        System.out.print("Here is your table!\nnumber | squared | cubed\n");
        for(int i = 1; i <= userNumber; i++) {
            System.out.print(i + "\t" + "\t" + "\t" + i + "\t" + "\t" + "\t" + i + "\n");
        }

    }
}
