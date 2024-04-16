class Koala {
    // covers Encapsulation of OOP using setters and 'this'
    // setting instance variables to private forces encapsulation
    private String name;
    private int age;


    // if you don't declare the scope of the instance name/variable it will match to closest variable aka the local variables
    // this. refers to Private String name; variable container aka that instance.
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // you don't have to always use this. you can set it directly. this is how to set a method without using this.

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PartSeventeen {
    // setters and 'this'
    public static void main(String[] args) {
        Koala koala1 = new Koala();
//        koala1.name = "Lulu";
//        koala1.age = 2;
        koala1.setName("lulu");
        koala1.setAge(1);
        System.out.println(koala1.getName());

    }
}
