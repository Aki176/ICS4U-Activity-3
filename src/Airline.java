public class Airline {

    // Attributes
    private String airLine;
    private int flightNumber;
    private String date;
    private int time;
    // End attributes

    // Constructor
    public Airline (String airLine, int flightNumber, String date, int time) {
        airLine = airLine;
        flightNumber = flightNumber;
        date = date;
        time = time;
    } // End constructor

    // Blank constructor
    public Airline () {
        airLine = "";
        flightNumber = 0;
        date = "";
        time = 0;
    } // End blank constructor

    // Setter assign value accessible from child class
    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(int time) {
        this.time = time;
    }
    // End setter

    // Getter retrieve value accessible from child class
    public String getAirLine() {
        return airLine;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }
    // End getter

} // End class Airline
