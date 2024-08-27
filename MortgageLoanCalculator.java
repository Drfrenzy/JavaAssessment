import java.util.Scanner;

public class MortgageLoanCalculator {

    public static void main(String... classwork) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal loan Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the Duration in years: ");
        int durationInYears = input.nextInt();

         

        int duration = durationInYears * 12;
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, duration)) /
                                (Math.pow(1 + monthlyInterestRate, duration) - 1);

        System.out.printf("Your monthly loan payment is NGN%,.2f", monthlyPayment);
    }
}
