package src.main.java;
//import stuff here
import java.util.Scanner;

public class Program7 {
    // Define conversion rates as final variables
    private static final int KLEVINS_PER_SCHRUTE_BUCK = 20;
    private static final int STANLEY_NICKELS_PER_KLEVIN = 12;
    private static final int STANLEY_NICKELS_PER_SCHRUTE_BUCK = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values from the user
        System.out.print("Enter schrute-bucks: ");
        int schruteBucks = scanner.nextInt();

        System.out.print("Enter klevins: ");
        int klevins = scanner.nextInt();

        System.out.print("Enter stanley-nickels: ");
        int stanleyNickels = scanner.nextInt();

        // Create an instance of Program7
        Program7 tester = new Program7();

        // Convert the old format to decimal schrute-bucks
        double decimalSchruteBucks = tester.convertMoney(schruteBucks, stanleyNickels, klevins);

        // Print the result
        System.out.printf("Decimal schrute-bucks = $%.2f%n", decimalSchruteBucks);

        // Testing with specific values
        double myTestVal = tester.convertMoney(7, 9, 17);  // Example test case
        System.out.printf("Test conversion with 7 schrute-bucks, 17 klevins, 9 stanley-nickels: $%.2f%n", myTestVal);

        // Close the scanner
        scanner.close();
    }

    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins) {
        // Convert klevins to stanley-nickels
        int totalStanleyNickelsFromKlevins = klevins * STANLEY_NICKELS_PER_KLEVIN;

        // Sum the input stanley-nickels with converted klevins
        int totalStanleyNickels = totalStanleyNickelsFromKlevins + stanleyNickels;

        // Convert schrute-bucks to stanley-nickels
        double totalStanleyNickelsFromSchruteBucks = schruteBucks * STANLEY_NICKELS_PER_SCHRUTE_BUCK;

        // Add all stanley-nickels
        double totalStanleyNickelsAll = totalStanleyNickelsFromSchruteBucks + totalStanleyNickels;

        // Convert total stanley-nickels to decimal schrute-bucks
        return totalStanleyNickelsAll / STANLEY_NICKELS_PER_SCHRUTE_BUCK;
    }
}
