import java.util.Arrays;



public class ArraysExercises {
    private String name;

    public ArraysExercises() {

    }


    public static String[] addPerson() {
        String[] persons = new String[3];

        persons[0] = "Moriah";
        persons[1] = "Andrew";
        persons[2] = "Iggy";


        for (String person : persons) {
            System.out.println("Iterated: " + person);
        }
        return persons;
    }
        public static void main(String[] args){
//            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println(Arrays.toString(numbers
//            ));
            System.out.println(Arrays.toString(addPerson()));


        }
    }

