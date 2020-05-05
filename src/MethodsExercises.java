public class MethodsExercises {
    public static void main(String[] args) {
    System.out.println(addition(2, 2));
    System.out.println(subtraction(4, 2));
    System.out.println(multiplication(5, 2));
    System.out.println(division(10, 2));
    System.out.println(modulus(11, 3));
    }

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
}
