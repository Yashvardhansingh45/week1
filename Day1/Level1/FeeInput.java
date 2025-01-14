package Level1;
import java.util.Scanner;
class FeeInput {
    public static void main(String[] args) {
        // Create a variable fee and assign type as double as in double fee;
        int fee, discountPercent, discountAmount;
        // Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        // Use Scanner Object to take user input 
            System.out.println("Enter the Student Fee");
                fee = input.nextInt();
        // Use Scanner Object to take user input
            System.out.println("Enter the University Discount");
                discountPercent = input.nextInt();
        // Compute discount and assign it to the discount variable.
        discountAmount = (fee * discountPercent) / 100;
        // Compute and print the fee you have to pay by subtracting the discount from the fee.
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + (fee - discountAmount));
        input.close();
    }    
}