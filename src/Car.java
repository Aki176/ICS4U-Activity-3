public class Car {

    // Attributes
    private String type;
    private long licenseNumber;

    // Constructor
    public Car (String type, long licenseNumber) {
        this.type = type;
        this.licenseNumber = licenseNumber;
    }

    // Blank Constructor
    public Car () {
        type = "";
        licenseNumber = 0;
    }

    // Getter retrieve value accessible from child class
    public String getType() {
        return type;
    }

    public long getLicenseNumber() {
        return licenseNumber;
    }
    // End getter

} // End class Car
