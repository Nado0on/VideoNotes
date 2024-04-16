class Shoe {
    public static final int SizeAmount = 24;
    private String name;

    public String getData() {
        String data = "Some stuff" + calculateStateTax();
        return data;
    }

    public int calculateStateTax() {
        return 6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PartTwentySeven {
    //Encapsulation - protects people working from outside the class to mess with it's code content
    // use getters and setters to acccess private data in other classes
    //PRo tip keep everything private but use public for constant variables
    public static void main(String[] args) {

    }
}
