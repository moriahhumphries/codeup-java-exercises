import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: \n");
        int userNumber = scanner.nextInt();
        System.out.print("You entered: " + userNumber + "\n");
        for(int i = 1; i <= userNumber; i++) {
            System.out.print("Counting from 1 to your number: " + i + "\n");
        }
    }
}
