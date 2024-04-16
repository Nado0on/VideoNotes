public class PartTen {
    //Arrays
    public static void main(String[] args) {
        int value = 8;
        double[] values;
        // setting 3 place holders for value
        values = new double[3];
        // now below we are creating command to start print at 0 which is technically 1
        System.out.println(values[0]);
        values[0] = 20;
        values[1] = 40;
        values[2] = 60;
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        // this loop will run through and print every aspect of your array
        for(int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

    }


}
