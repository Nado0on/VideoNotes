public class PartTwenty {
    //String Builder and String Formatting
    public static void main(String[] args) {
        String info = "";
        //inefficient reassiging empty space to hold the values below each time += is used it updates the info variable contaner
        info += "My name is Nadin Seif";
        info += " ";
        info += "I am a builder";
        System.out.println(info);

        StringBuilder morseCode = new StringBuilder("");
        morseCode.append("My name is Nadin");
        morseCode.append("");
        morseCode.append("I am a leo");



        //shows the code morseCode contain
        System.out.println(morseCode.toString());

     // formating integers
        System.out.println("Here is some text.\tThat was a tab. \nThat was a newline");
        // formatting special characters
        System.out.printf("Total is  -10d qty is %d\n", 5, 120);

        for(int i=0; i<20; i++){
            System.out.printf("%-2d: %s\n", i, "here is some text");


        }
    }
}
