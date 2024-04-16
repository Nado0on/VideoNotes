public class Plant {
    // bad practice
    public String name;

    // Acceptable practice - it's final
    public static int badgeNumber = 8;

    private String type;
    protected String size;
    public Plant() {
      this.name = "Ted";
      type = "plant";
      this.size = "medium";
    }
}
