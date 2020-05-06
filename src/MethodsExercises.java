import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            Dice();
            System.out.println("Would you like to continue?");
            String play = scan.nextLine();
            if (play.toLowerCase().equals("no")) {
                break;
            }
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            factorial();
            System.out.println("Would you like to continue?");
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("no")) {
                break;
            }
        }
        System.out.println("Get Integer");
        getInteger(1, 10);
//        System.out.println(addition(2, 2));
//        System.out.println(subtraction(4, 2));
//        System.out.println(multiplication(5, 2));
//        System.out.println(division(10, 2));
//        System.out.println(modulus(11, 3));


//        System.out.println(getInteger());
//        getInteger();
    }

    // 1
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }


    // 2
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scanner.nextLine());

        // how to stop
        if (userInput < min || userInput > max) {
            System.out.println("You entered invalid number: " + userInput);
            return getInteger(min, max);
        } else {
            System.out.println("You entered a valid number!");
            return userInput;
        }
    }

    //3

    public static void factorial(){
        int userInput = getInteger(1, 10);
        int sum = 1;
        System.out.println("You entered: " + userInput);
        for(int fact = userInput; fact > 0; fact--) {
            sum *= fact;
        }
            System.out.println("Factorial of " + userInput+ ": " + sum);
        }


    public static void Dice(){
//        roll = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for the sides of your dice: ");
        int diceSide = Integer.parseInt(scan.nextLine());
        System.out.println("Your dice has " + diceSide + " sides");
//        Random random = new Random();
//        int randomRoll = random.nextInt(diceSide) + 1;
        int range = diceSide - 1 + 1;
        System.out.println(("randomRoll1 = " + ((int)(Math.random() * range) + 1)));
        System.out.println(("randomRoll2 = " + ((int)(Math.random() * range) + 1)));

//    int userDice1 = Integer.parseInt(scan.nextLine());
//        System.out.println("Enter number for the sides of your second dice: ");
//        int userDice2 = Integer.parseInt(scan.nextLine());
//        int totalSides = userDice1 + userDice2;
//        System.out.print("You entered: \n" + userDice1 + " and " + userDice2 + "\n");
//        // continue message
//
//        Random random = new Random();
//        public int roll() {
//            Random rollDice = new Random();
//            int totalRoll = rollDice.nextInt();
//            System.out.println(totalRoll);
//        }

    }
}

