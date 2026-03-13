/**
 * ============================================================
 * MAIN CLASS - UseCase2RoomInitialization
 * ============================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * Demonstrates room initialization using domain models
 * before introducing centralized inventory management.
 *
 * Availability is represented using simple variables
 * to highlight limitations.
 *
 * @author Bhoomi
 * @version 2.1
 */
public class UseCase2RoomInitialization {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hotel Room Initialization\n");

        // Static availability representation
        int singleRoomAvailability = 5;
        int doubleRoomAvailability = 3;
        int suiteRoomAvailability = 2;

        // Create room objects
        Room single = new SingleRoom();
        Room doubleR = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display details
        System.out.println("Single Room:");
        single.displayRoomDetails(singleRoomAvailability);

        System.out.println("\nDouble Room:");
        doubleR.displayRoomDetails(doubleRoomAvailability);

        System.out.println("\nSuite Room:");
        suite.displayRoomDetails(suiteRoomAvailability);

        System.out.println("\nSystem initialized successfully.");
    }
}

/**
 * ============================================================
 * ABSTRACT CLASS - Room
 * ============================================================
 *
 * Represents a generic hotel room.
 * Defines common attributes and enforces structure.
 *
 * @version 2.1
 */
abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    // Display details with availability
    public void displayRoomDetails(int availability) {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
        System.out.println("Available: " + availability);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}