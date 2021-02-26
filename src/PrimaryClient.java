public class PrimaryClient {

    // Attributes
    private String name;
    // End attributes

    // Constructor
    public PrimaryClient (String name) {
        name = name;
    }

    // Blank constructor
    public PrimaryClient () {
        name = "";
    }

    // Getter retrieve value accessible from child class
    public String getName() {
        return name;
    } // End getter

    // Setter assign value accessible from child class
    public void setName(String name) {
        this.name = name;
    } // End setter

} // End class PrimaryClient
