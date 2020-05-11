import java.util.Arrays;

public class ArraysExercises {
    private String name;

    public ArraysExercises() {
    }

//    public static String[] personArray() {
//        String[] persons = new String[3];
//
//        persons[0] = "Moriah";
//        persons[1] = "Andrew";
//        persons[2] = "Iggy";
//
//
//        for (String person : persons) {
//            System.out.println("Iterated: " + person);
//        }
//        return persons;
//    }


    public static void main(String[] args) {
//            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println(Arrays.toString(numbers
//            ));
//            System.out.println(Arrays.toString(personArray()));
        Person[] people = new Person[3];

        people[0] = new Person("Moriah");
        people[1] = new Person("Andrew");
        people[2] = new Person("Iggy");


        for (Person person: people) {
            System.out.println("Iterated: " + Arrays.toString(people));
        }
    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeopleArray = new Person[people.length + 1];

        for(int i = 0; i < people.length; i++){
            newPeopleArray[i] = people[i];
        }
        newPeopleArray[newPeopleArray.length - 1] = person;
        return newPeopleArray;
    }
}


