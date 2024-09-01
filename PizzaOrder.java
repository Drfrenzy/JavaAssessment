import java.util.Scanner;

public class PizzaOrder {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter number of people ordering for: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the pizza type: \n Sapa,\n Small Money,\n Big Boys,\n Odogwu: ");
        String pizzaType = scanner.nextLine();

        int slicesPerBox = 0;
        int pricePerBox = 0;

        
        switch (pizzaType) {
            case "Sapa":
                slicesPerBox = 4;
                pricePerBox = 2000;
                break;
            case "Small Money":
                slicesPerBox = 6;
                pricePerBox = 2400;
                break;
            case "Big Boys":
                slicesPerBox = 8;
                pricePerBox = 3000;
                break;
            case "Odogwu":
                slicesPerBox = 12;
                pricePerBox = 4200;
                break;
            default:
                System.out.println("Invalid pizza type entered.");
                return;
        }

        
        int pizzaboxNeeded = (int) Math.ceil((double) numberOfPeople / slicesPerBox);
        int totalSlices = pizzaboxNeeded * slicesPerBox;
        int leftoverSlices = totalSlices - numberOfPeople;
        int totalCost = pizzaboxNeeded * pricePerBox;

        
        System.out.println("Number of boxes of pizza to buy: " + pizzaboxNeeded);
        System.out.println("Number of leftover slices: " + leftoverSlices);
        System.out.println("Total cost: NGN " + totalCost);
    }
}
