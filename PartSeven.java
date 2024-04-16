import java.util.Scanner;
public class PartSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("Enter info: ");
        //line will cause a user return for input
        String line = input.nextLine();
        // can also use int value = input.nextInt();
        // use whatever data Type
        // tell them what they entered
        System.out.println("you entered: " + line);
    }
}
