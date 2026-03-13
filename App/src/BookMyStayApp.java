import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ============================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * Demonstrates centralized inventory management using HashMap.
 * Room availability is stored in a single source of truth,
 * eliminating scattered variables and improving scalability.
 *
 * @author Bhoomi
 * @version 3.1
 */
public class UseCase3InventorySetup {
    public static void main(String[] args) {
        System.out.println("Hotel Room Inventory Initialization\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current availability
        System.out.println("=== Current Room Availability ===");
        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Update availability example
        System.out.println("\nUpdating availability...");
        inventory.updateAvailability("SuiteRoom", 1);

        // Display updated availability
        System.out.println("\n=== Updated Room Availability ===");
        for (Map.Entry<String, Integer> entry : inventory.getRoomAvailability().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nSystem initialized successfully.");
    }
}

/**
 * ============================================================
 * CLASS - RoomInventory
 * ============================================================
 *
 * Acts as the single source of truth for room availability.
 * Encapsulates inventory logic using HashMap.
 *
 * @version 3.1
 */
class RoomInventory {
    /**
     * Stores available room count for each room type.
     * Key => Room type name
     * Value => Available room count
     */
    private Map<String, Integer> roomAvailability;

    /**
     * Constructor initializes the inventory
     * with default availability values.
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initializes room availability data.
     * Centralizes inventory setup.
     */
    private void initializeInventory() {
        roomAvailability.put("SingleRoom", 5);
        roomAvailability.put("DoubleRoom", 3);
        roomAvailability.put("SuiteRoom", 2);
    }

    /**
     * Returns the current availability map.
     *
     * @return map of room type to available count
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Updates availability for a specific room type.
     *
     * @param roomType The room type to update
     * @param count new availability count
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}