public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

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
        System.out.println("Hello, my name is:  " + getName());
    }

    public static void main(String[] args) {
        Person Moriah = new Person("Moriah");
        Moriah.setName("Moriah");
        System.out.println(Moriah.getName());
        Moriah.sayHello();

        // 2
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

}




