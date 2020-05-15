package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

//    public Input(){}

    public String getString(){
        System.out.println("Type something: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Select y/n");
        String answer = scanner.nextLine();
        return answer.equals("y") ? true : false;
    }

    public int getInt(int min, int max){
        System.out.println("Give me a number between " + min + " and "  + max);
        int aNumber;
        try {
            aNumber = Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            return getInt(min, max);
        }

        if(aNumber < min || aNumber > max){
            System.out.println("Outside of the range, try again");
            return getInt(min, max);
        }
        return aNumber;
    }

    public int getInt(){
        System.out.println("Give me an integer:");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        System.out.println("Give me a decimal between " + min + " and "  + max);
        double aDecimal;
        try {
           aDecimal = Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            return getDouble(min, max);
        }
        if(aDecimal < min || aDecimal > max){
            System.out.println("Outside of the range, try again");
            return getDouble(min, max);
        }
        return aDecimal;
    }

    public double getDouble(){
        System.out.println("Give me a decimal:");
        try {
            return Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            return getDouble();
        }
    }

}



//package util;
//
//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner = new Scanner(System.in);
//
//    public String getString() {
//        System.out.println("Enter a sentence: ");
//        return scanner.nextLine();
//
//    }
//
//    public boolean yesNo(){
//        System.out.println("Enter yes or no");
//        String answer = scanner.nextLine();
//        return answer.equals("Yes") ? true : false;
//    }
//
//    public int
//}
