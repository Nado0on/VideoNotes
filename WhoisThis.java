public class WhoisThis implements Info {
    private String name;

    public WhoisThis(String name) {
        this.name = name;
    }

    public void greet () {
        System.out.println("Hey there!");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
