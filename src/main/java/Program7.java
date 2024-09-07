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
        double decimalSchruteBucks = tester.convertMoney(schruteBucks, klevins, stanleyNickels);

        // Print the result
        System.out.printf("Decimal schrute-bucks = $%.2f%n", decimalSchruteBucks);

        // Close the scanner
        scanner.close();
    }

    public double convertMoney(int schruteBucks, int klevins, int stanleyNickels) {
        // Convert klevins to fractional schrute-bucks
        double totalSchruteBucksFromKlevins = klevins / (double) KLEVINS_PER_SCHRUTE_BUCK;

        // Convert stanley-nickels to fractional schrute-bucks
        double totalSchruteBucksFromStanleyNickels = stanleyNickels / (double) (STANLEY_NICKELS_PER_KLEVIN * KLEVINS_PER_SCHRUTE_BUCK);

        // Add everything to schrute-bucks
        double totalSchruteBucks = schruteBucks + totalSchruteBucksFromKlevins + totalSchruteBucksFromStanleyNickels;

        return totalSchruteBucks;
    }
}
