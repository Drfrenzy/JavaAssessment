import java.util.Scanner;

public class CreditLimit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter balance at the beginning of the month (NGN): ");
        int balance = scanner.nextInt();

        System.out.print("Enter total items charged by the customer this month (NGN): ");
        int charges = scanner.nextInt();

        System.out.print("Enter total credit applied to the customer account (NGN): ");
        int credit = scanner.nextInt();

        System.out.print("Enter allowed credit limit by the store (NGN): ");
        int creditLimit = scanner.nextInt();

        int newBalance = balance + charges - credit;

        System.out.printf("New balance: NGN %d%n", newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Credit limit not exceeded");
        }

        scanner.close();
    }
}
