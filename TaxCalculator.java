import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the name of citizen " + i + ":");
            String name = scanner.nextLine();
            System.out.println("Enter the earnings of " + name + ":");
            double earnings = scanner.nextDouble();
            scanner.nextLine(); 

            double tax;
            final double Threshold = 30000.0;
            if (earnings <= Threshold) {
                tax = earnings * (15.0 / 100); 
            } 
            else {
                tax = (Threshold * (15.0 / 100)) + ((earnings - Threshold) * (20.0 / 100)); 
            }

            System.out.println("Citizen: " + name);
            System.out.println("Earnings: NGN" + earnings);
            System.out.println("Total Tax: NGN" + tax);
            System.out.println();
        }

        scanner.close();
    }
}
