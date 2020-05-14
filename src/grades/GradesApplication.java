package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        String userInput;
        boolean confirm = true;


        Student Moriah = new Student("Moriah");
        Moriah.addGrade(98);
        Moriah.addGrade(50);
        Moriah.addGrade(87);

        Student Andrew = new Student("Andrew");
        Andrew.addGrade(96);
        Andrew.addGrade(97);
        Andrew.addGrade(82);

        Student Iggy = new Student("Iggy");
        Iggy.addGrade(100);
        Iggy.addGrade(99);
        Iggy.addGrade(97);

        Student Kerrigan = new Student("Kerrigan");
        Kerrigan.addGrade(93);
        Kerrigan.addGrade(94);
        Kerrigan.addGrade(84);

        students.put("moriahhumphries", Moriah);
        students.put("ahumphries", Andrew);
        students.put("mrspecial", Iggy);
        students.put("sweetbeeps", Kerrigan);

        printStudents(students);
    }

    public static void printStudents(HashMap<String, Student> students) {

        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:\n");

        for(String key : students.keySet()){
            System.out.println(key + " ");
        }
        System.out.println("What student would you like to see more information on?");
        userInput = input.getString();
        if(students.containsKey(userInput)){
            System.out.println("Found student");
            } else {
            System.out.println("Sorry, no student found with the GitJub username: " + userInput);
        }
        System.out.println("Would you like to see another student?");
        } while (userInput)
    }
}
