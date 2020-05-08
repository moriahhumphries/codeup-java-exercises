package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a sentence: ");
        return scanner.nextLine();

    }

    public boolean yesNo(){
        System.out.println("Enter yes or no");
        String answer = scanner.nextLine();
        return answer.equals("Yes") ? true : false;
    }

    public int
}
