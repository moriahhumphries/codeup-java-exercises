public class Person {
    private String name;

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
    this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, my name is:  " + name);
    }

    public static void main(String[] args) {
        Person testPerson = new Person();
        testPerson.setName("Moriah");
        System.out.println(testPerson);



    }

}




