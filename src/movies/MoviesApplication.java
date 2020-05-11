//package movies;
//
//import util.Input;
//
//public class MoviesApplication {
//    public static void main(String[] args) {
//
//
//        boolean keepGoing = true;
//        while (keepGoing) {
//            System.out.println(returnMenuDisplay());
//            int response = promptUserForChoice();
//            if (response == 0){
//                keepGoing = executeUserChoice(response);
//            }
//
//        }
//
//    }
//
//    private static boolean executeUserChoice(int choice){
//        boolean continueRunningApp = true;
//
//        switch(choice) {
//            case 0:
//                continueRunningApp = false;
//                break;
//
//        }
//    }
//
//    private static String returnMenuDisplay(){
//        String choices = "What would you like to do?\n" +
//                "\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category\n" +
//                "\n" +
//                "Enter your choice: 1\n" +
//                "\n" +
//                "Frankenstein -- horror\n" +
//                "Goodfellas -- drama\n" +
//                "Pulp Fiction -- drama\n" +
//                "...";
////        System.out.println("Choices " + choices);
//        return choices;
//    }
//
//    private static int promptUserForChoice() {
//        Input input = new Input();
//        System.out.println("Enter your choice: ");
//        int response =
//        return input;
//    }
//}
