package Level1;
import java.util.Scanner;
class UnitPrice {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take the unit price and quantity as input
        System.out.print("Enter the unit price of an item: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();
        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;
        // Display the total purchase price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        sc.close();
    }
}