import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s\n", pi);

        Scanner scanner = new Scanner(System.in);
//        // User enters 1 number
//        System.out.print("Enter a number: ");
//        int userNumber = scanner.nextInt();
//        System.out.printf("You entered: %s\n", userNumber);
//
//        // User enters 3 consecutive words
//        System.out.print("Enter 3 words: \n");
//        String userWordOne = scanner.next();
//        String userWordTwo = scanner.next();
//        String userWordThree = scanner.next();
//        System.out.printf("You entered: %s %s %s\n", userWordOne, userWordTwo, userWordThree);

        // User enters a sentence

        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("You entered: %s\n", userSentence);


    }
}
