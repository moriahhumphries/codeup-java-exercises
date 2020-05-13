package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }


    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : this.grades) {
            total += grade;
        }
        return total / this.grades.size();
    }


    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<>();
        Student Moriah = new Student("Moriah");
        Student Andrew = new Student("Andrew");
        Student Iggy = new Student("Iggy");
        Students.add("Moriah");
        Students.add("Andrew");
        Students.add("Iggy");
        Moriah.addGrade(98);
        Moriah.addGrade(50);
        Moriah.addGrade(86);
        Andrew.addGrade(96);
        Andrew.addGrade(97);
        Andrew.addGrade(82);
        Iggy.addGrade(100);
        Iggy.addGrade(99);
        Iggy.addGrade(98);
        System.out.println("Student Name: " + Moriah.getName());
        System.out.println(Moriah.getGradeAverage());
//        for (Student Student : students.values()) {
//            System.out.println("person.getFullName() = " + Student.getName());


        }

    }

