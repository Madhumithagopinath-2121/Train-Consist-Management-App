import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== UC7 - Sort Bogies by Capacity (Comparator) ===");
        System.out.println();

        // Create a list to store bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD DATA ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // ---- BEFORE SORTING ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();

        // ---- SORT USING COMPARATOR ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ---- AFTER SORTING ----
        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();
        System.out.println("UC7 sorting completed ...");
    }
}