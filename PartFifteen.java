class Human {
    String name;
    int age;
    void speak() {
        System.out.println("My name is: " + name);
    }
int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    //intialiazing get method
    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

// getting values from methods

public class PartFifteen {
    public static void main(String[] args) {
        Human firstPerson = new Human();
        firstPerson.name = "Nadin Seif";
        firstPerson.age = 25;
        firstPerson.speak();
        int years = firstPerson.calculateYearsToRetirement();
        System.out.println("Years left to retirement " + years);

        int age = firstPerson.getAge();
        String name = firstPerson.getName();
        System.out.println("Name is: " + name);
        System.out.println("Age i: " + age);
    }
}
