
class Bear {
    private int id;
    private String name;

    public Bear(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //useful for string representation
    public String toString() {
        StringBuilder firstString = new StringBuilder();
        firstString.append(id).append(": ").append(name);
        return id + ": " + name;
    }
}
public class PartTwentyOne {
    // toString() and the object class
    public static void main(String[] args) {
      Bear bear1 = new Bear(1, "Mama bear");
        System.out.println(bear1);
    }
}
