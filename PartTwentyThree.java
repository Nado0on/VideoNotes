public class PartTwentyThree {
    public static void main(String[] args) {

        Roomba roro1 = new Roomba();
        roro1.start();

        Person human1 = new Person("Nadin");
        human1.greet();

        Info info1 = new Roomba();
        info1.showInfo();
        Info info2 = human1;
        info2.showInfo();
outputinfo(roro1);
outputinfo(human1);
    }

    private static void outputinfo(Info info) {
        info.showInfo();
    }
}

