public class Car extends Trailer{
    @Override
    public void start() {
        super.start();
    }

    public void wipeWindshield() {
        System.out.println("Wiping windshield");
    }

    public void showInfo() {
        System.out.println("car name: " + name);
    }
}
