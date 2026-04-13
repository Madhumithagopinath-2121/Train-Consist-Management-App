import java.util.*;

public class TrainConsistManagementApp {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC10 - Count Total Seats in Train ===");
        System.out.println();

        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70)); // to match total = 222

        // ---- DISPLAY ----
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();

        // ---- AGGREGATE USING STREAM ----
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);    // sum all

        // ---- DISPLAY RESULT ----
        System.out.println("Total Seating Capacity of Train: " + totalCapacity);
        System.out.println();
        System.out.println("UC10 aggregation completed ...");
    }
}