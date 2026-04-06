import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println();

        // Create a HashMap to store bogie and capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ---- INSERT DATA ----
        // put() maps bogie name to its capacity
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);


        // ---- DISPLAY DATA ----
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println("UC6 mapping completed successfully ...");
    }
}
