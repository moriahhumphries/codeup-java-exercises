package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student moriah = new Student("Moriah Humphries");
        moriah.addGrade(90);
        System.out.println(moriah.getGradeAverage());
        System.out.println(moriah.getGradeAverage() == 90);
        moriah.addGrade(70);
        System.out.println(moriah.getGradeAverage() == 80);

        Student andrew = new Student("Andrew Humphries");
        andrew.addGrade(100);
        andrew.addGrade(50);

        Student iggy = new Student("Iggy Humphries");
        iggy.addGrade(87);
        iggy.addGrade(99);

        students.put("moriahhumphries", moriah);
        students.putIfAbsent("andrewh", andrew);
        students.putIfAbsent("iggo", iggy);

        cli(students);

    }

    public static void cli(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        do{

            for (String key : students.keySet()) {
                System.out.println(key + " ");
            }

            System.out.println("What student would you like to see more information on?\n");
            String typedKey = input.getString();
            if(students.containsKey(typedKey)){

                Student currentStudent = students.get(typedKey);

                System.out.println(String.format("Name: %s - GitHub Username: %s\n"
                                + "Current Average: %.2f",
                        currentStudent.getName(),
                        typedKey,
                        currentStudent.getGradeAverage()
                ));
            }else{
                System.out.println("Sorry, no student found with the GitHub username of "+ typedKey);
            }
            System.out.println("Would you like to see another student?");
        }while(input.yesNo());

        System.out.println("Goodbye, and have a wonderful day!");

    }

}