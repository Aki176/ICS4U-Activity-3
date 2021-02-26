public class Reservation {

    // Attributes
    private int amountOfTravelers;
    // End attributes

    // Constructor
    public Reservation (int amountOfTravelers) {
        amountOfTravelers = amountOfTravelers;
    } // End constructor

    // Blank constructor
    public Reservation () {
        amountOfTravelers = 0;
    } // End blank constructor

    // Getter retrieve value accessible from child class
    public int getAmountOfTravelers() {
        return amountOfTravelers;
    } // End getter

    // Setter assign value accessible from child class
    public void setAmountOfTravelers(int amountOfTravelers) {
        this.amountOfTravelers = amountOfTravelers;
    } // End setter

} // End class Reservation
