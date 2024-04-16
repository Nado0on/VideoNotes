
public class Oak extends Plant{
    public Oak() {
// wont work - type is private
        // type = "Tree";

        // this will work because protected is accessible in any class, subclaass and in same package. Oak is a subclass of plant
        this.size = "large";
    }

}
