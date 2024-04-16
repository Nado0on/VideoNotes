public class Roomba implements Info {
    private int id = 7;
    public void start () {
        System.out.println("machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}
