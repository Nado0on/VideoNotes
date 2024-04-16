class Machine {
    // constructor doesn't have a return type and name of constructor has to be the same name as class - even the upperCase letter will be used too.
   // constructors are used for intialization of instance variables
    // you can have constructors with the same name aa long as they have different parameters, java will figure it out.
private String name;
private int code;
    public Machine() {
        // a call to a constructor needs to be the first line this is just simply calling t onstructor that can acccept these parameters to be used in first constructor
        this("Nadin", 11);
        System.out.println("constructor running!");

    }

    public Machine(String name) {
        this(name, 0);
        System.out.println("Second Constructor running");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}
public class PartEighteen {
    //constructors
    // constructors are a special method that is run everytime you create an instance of your class, constructors can take parameters
    // creating new instance of class so aka now this is an object
    public static void main(String[] args) {
        Machine Robot1 = new Machine();

        // this code will run the Machine method that has a String parameter
        Machine Robot2 = new Machine("Nancy");
        Machine Robot3 = new Machine("Tweety", 22);

    }

}
