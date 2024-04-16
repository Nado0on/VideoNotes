import java.util.Scanner;

public class PartNine {
    public static void main(String[] args) {
        // allows you to take different actions depending on the value of a variable
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a command: ");
        String text = input.nextLine();

        //switch statements are good for comparing strings

        switch (text) {
            case "start":
                System.out.println("machine started!");
                break;

            case "Stop":
                System.out.println("Machine Stopped!");
                break;
            default:
                System.out.println("command not recognized");
        }

    }
}
