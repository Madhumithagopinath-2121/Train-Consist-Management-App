import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---- BOGIE MODEL ----
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            // ---- VALIDATION ----
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UC14 - Handle Invalid Bogie Capacity ===");
        System.out.println();

        try {
            // ---- VALID BOGIE ----
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.type + " -> " + b1.capacity);

            // ---- INVALID BOGIE ----
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0); // will throw exception

        } catch (InvalidCapacityException e) {
            // ---- HANDLE ERROR ----
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("UC14 exception handling completed ...");
    }
}