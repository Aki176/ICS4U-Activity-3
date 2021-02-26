import java.util.Scanner;

public class BookingInterface {

    // ======================== //
    // Main
    public static void main (String[] args) {

        String answer;

        // Welcome message
        System.out.println("Welcome to BookNow v1.0!");
        System.out.println();

        // Initialize class
        PrimaryClient client1 = new PrimaryClient();
        Reservation reservation1 = new Reservation();
        Hotel hotel1 = new Hotel();
        Car car1 = new Car("Tesla X", 2147483647);
        Airline airline1 = new Airline();

        // Set client info
        Scanner input = new Scanner(System.in);

        // Name
        System.out.println("Please type your name in:");
        client1.setName(input.nextLine());

        // Number of travelers
        System.out.println("How many amount of travelers total you have?");
        reservation1.setAmountOfTravelers(Integer.parseInt(input.nextLine()));

        // Hotel handler
        System.out.println("Do you want to book hotel? (Yes/No)");
        answer = input.nextLine();
        if(answer.charAt(0)=='y' || answer.charAt(0)=='Y') {
            System.out.println("What is the rating you wanted for the hotel? (1 to 5)");
            hotel1.setRatingWanted(Integer.parseInt(input.nextLine()));
            System.out.println("How many rooms you want to book?");
            hotel1.setAmountRooms(Integer.parseInt(input.nextLine()));
            System.out.println("What is the date you will check in hotel?");
            hotel1.setDate(input.nextLine());
        } else {
            System.out.println("Hotel opted out!");
        }

        // Airline handler
        System.out.println("Do you want to share us your flight information if you have?(Yes/No)");
        answer = input.nextLine();
        if(answer.charAt(0)=='y' || answer.charAt(0)=='Y') {
            System.out.println("What is your airline name?");
            airline1.setAirLine(input.nextLine());
            System.out.println("What is your flight number?");
            airline1.setFlightNumber(Integer.parseInt(input.nextLine()));
            System.out.println("What date you will fly?");
            airline1.setDate(input.nextLine());
            System.out.println("At exactly what time?");
            airline1.setTime(Integer.parseInt(input.nextLine()));
        } else {
            System.out.println("Flight report opted out!");
        }

        System.out.println();
        System.out.println("Thank you very much for your registration. " +
                "You are our 100000000th client and you get a free car come with your registration. Here is the detail of everything:");
        System.out.println();
        System.out.println("Client name: " + client1.getName());
        System.out.println("Amount of Travelers: " + reservation1.getAmountOfTravelers());
        System.out.println("Hotel rating wanted: " + hotel1.getRatingWanted());
        System.out.println("Amount rooms: " + hotel1.getAmountRooms());
        System.out.println("Date check-in hotel: " + hotel1.getDate());
        System.out.println("Free car type: " + car1.getType());
        System.out.println("Free car license number: " + car1.getLicenseNumber());
        System.out.println("Airline: " + airline1.getAirLine());
        System.out.println("Flight number: " + airline1.getFlightNumber());
        System.out.println("Flight date: " + airline1.getDate());
        System.out.println("Flight time: " + airline1.getTime());
        input.close();
    } // End main

} // End class BookingInterface
