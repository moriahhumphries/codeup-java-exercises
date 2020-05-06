import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        getInteger(1, 10);
        factorial();
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
    }


