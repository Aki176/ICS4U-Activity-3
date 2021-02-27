public class PrimaryClient {

    // Attributes
    private String name;
    // End attributes

    // Composition has-a relationship
    private Reservation reservation;

    // Constructor
    public PrimaryClient (String name) {
        this.reservation = new Reservation();
        name = name;
    }

    // Blank constructor
    public PrimaryClient () {
        this.reservation = new Reservation();
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

    public int getAmountOfTravelers() {
        return reservation.getAmountOfTravelers();
    }

    public void setAmountOfTravelers(int amountOfTravelers) {
        reservation.setAmountOfTravelers(amountOfTravelers);
    }

} // End class PrimaryClient
