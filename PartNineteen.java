class Thing {
    //if you declare a final variable you must assign value to it whn you create it.
    public final static int LUCKY_TOKEN  = 7;
    public String name;

    // example of when it's good to use static variable
    public static int count = 0;
    public int id;
    public Thing() {
        id = count;
        count++;
    }

    //static variables belong to the class so there fore the variable description has to be accessed using class name
    public static String description;

    //instance methods CAN access static variables/Data
    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    //static method, they can access static data because they belong to class as well
    // static methods cant output instance variables
    public static void showInfo() {
        System.out.println(description);
    }
}

public class PartNineteen {
    //covering static and final variable methods
    public static void main(String[] args) {
        Thing.description = "Presenting Dr. Seuss all about Thing1 and Thing2! ";
        System.out.println(Thing.description);
        System.out.println("before creating objects, count is: " + Thing.count);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("After creating objects, count is: " + Thing.count);
        thing1.name = "Chico";
        thing2.name = "Munchie";
        thing1.showName();
        thing2.showName();

        // use of static method
        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_TOKEN);
    }
}
