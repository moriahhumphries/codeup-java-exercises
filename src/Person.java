public class Person {
    private String name;


    public Person(String name) {
        this.name = name;

    }

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
    Person me = new Person("Moriah");
    me.getName();

    }

}



