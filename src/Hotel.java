public class Hotel {

    // Attributes
    private int ratingWanted;
    private int amountRooms;
    private String date;
    // End attributes

    // Constructor
    public Hotel (int ratingWanted, int amountRooms, String date) {
        ratingWanted = ratingWanted;
        amountRooms = amountRooms;
        date = date;
    } // End constructor

    // Blank constructor
    public Hotel () {
        ratingWanted = 0;
        amountRooms = 0;
        date = "";
    } // End blank constructor

    // Setter assign value accessible from child class
    public void setRatingWanted(int ratingWanted) {
        this.ratingWanted = ratingWanted;
    }

    public void setAmountRooms(int amountRooms) {
        this.amountRooms = amountRooms;
    }

    public void setDate(String date) {
        this.date = date;
    }
    // End setter

    // Getter retrieve value accessible from child class
    public int getRatingWanted() {
        return ratingWanted;
    }

    public int getAmountRooms() {
        return amountRooms;
    }

    public String getDate() {
        return date;
    }
    // End getter

} // End class Hotel
