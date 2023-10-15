import java.util.Scanner;

public class Meter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        double meter;

        System.out.println("Enter a meter measurement (Positive number)");
        do {
            if (scan.hasNextDouble()) {
                meter = scan.nextDouble();
                if (meter > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Calculations
        double meterToMile = meter * METERS_TO_MILES;
        double meterToFeet = meter * METERS_TO_FEET;
        double meterToInch = meter * METERS_TO_INCHES;

        // Outputs
        System.out.printf("%-8s %.2f", "Meters:", meter);
        System.out.printf("\n%-7s %.2f", "Inches:", meterToInch);
        System.out.printf("\n%-5s %.2f", "Feet:", meterToFeet);
        System.out.printf("\n%-6s %.2f", "Miles:", meterToMile);

    }
}