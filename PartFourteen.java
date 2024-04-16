class Greeting {
    String name;

    //method called speak
    void speak() {
        System.out.println("Hiiii " + "" + name);
    }
}

public class PartFourteen {
    // methods
    // methods start with a lowercase letter;
    public static void main(String[] args) {
        Greeting firstOutput = new Greeting();
        firstOutput.name = "Nadin Seif";
        firstOutput.speak();
    }

}

