import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== UC11 - Validate Train ID & Cargo Code ===");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // ---- INPUT ----
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        System.out.println();

        // ---- DEFINE REGEX ----
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ---- VALIDATION ----
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // ---- OUTPUT ----
        if (isTrainValid) {
            System.out.println("Train ID is VALID ");
        } else {
            System.out.println("Train ID is INVALID ");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ");
        } else {
            System.out.println("Cargo Code is INVALID ");
        }

        System.out.println();
        System.out.println("UC11 validation completed ...");

        scanner.close();
    }
}