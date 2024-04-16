public class PartTwelve {
    //multi-dimensional arrays
    public static void main(String[] args) {
        int[] values = {2, 5, 2024};
        System.out.println(values[2]);
        //multi-dimensional array can have values with different lengths
        int[][] grid = {
                {2, 5, 2024},
                {2, 4},
                {1, 2, 3, 4}
        };
        //row 1 index 1 because rows start at 0
        System.out.println(grid[1][1]);

        //intializing array
        String[][] texts = new String[2][3];
        texts[0][1] = "hello Mikaila";
        System.out.println(texts[0][1]);

        for(int row=0; row<grid.length; row++) {
            for(int col=0; col < grid[row].length; col++) {
                //will print every value on same line
                System.out.print(grid[row][col] + "/t");
            }
            System.out.println();
        }

    }
}
