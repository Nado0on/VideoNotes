public class PartTwentySix {

    //Polymoprhism allows you to use child class anywhere you can use the parent class
    public static void main(String[] args) {
        Flower flower = new Flower();
        Tree tree = new Tree();
        Flower flower2 = tree;

        flower2.grow();
        tree.shedLeaves();
    }
    public static void doGrow(Flower flower) {
        flower.grow();
    }
}
