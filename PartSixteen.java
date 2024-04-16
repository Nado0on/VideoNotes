class Robot {
    // intializing method
    //passing parameter with string variable
    // above - you can change the value of what comes out by changing the value in the chute ()
    public void speak(String greeting) {
        System.out.println(greeting);
    }

    public void height(int length) {
        System.out.println("I'm thiiiiiiisss inches tall: " + length);
    }

    public void favoriteActivities(String activity1, String activity2) {
        System.out.println("I can do this: " + " " + activity1 + " " + "and also: " + activity2);
    }
}

public class PartSixteen {
    //main method where all my methods are outputing
    //Method Parameters
    public static void main(String[] args) {
        Roomba WallE = new Roomba();
        WallE.speak("Hi i'm WallE");

        WallE.height(10);
        WallE.favoriteActivities("Swimming", "Skating");


        /* you can also do the following -
        int value = 14; <- acts as a container for data
        WallE.height(value); <- acts a label

         */

    }

}
