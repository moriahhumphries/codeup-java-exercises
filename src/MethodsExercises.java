import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(addition(2, 2));
        System.out.println(subtraction(4, 2));
        System.out.println(multiplication(5, 2));
        System.out.println(division(10, 2));
        System.out.println(modulus(11, 3));
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
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
        return min + max;

    }





}
