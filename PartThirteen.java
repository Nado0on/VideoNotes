class Person {
    String name;
    int age;
}
public class PartThirteen {
    //OOP - Classes
    // if you declare a public class, class name must match file name .java
    // you can have only one public class in that file but as many non-public classes as you like
    // a class is a template for creating objects aka creates genre
    // classes can contain 1. Data - represents state use instance variables to hold data
    // classes can also contain sub routines (methods) - use methods to declare actions/routines
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "joe bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Nadin Seif";
        person2.age = 25;

        System.out.println(person2.name);

    }
}
