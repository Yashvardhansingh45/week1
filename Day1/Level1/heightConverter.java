package Level1;
import java.util.Scanner;
class heightConverter {
    public static void main(String[] args) {
        // declare the variables
        double height, feet, inches;
        // Create Scanner Object 
        Scanner input = new Scanner(System.in);
        // Use Scanner Object to take user input
        System.out.println("Enter your height in centimeters");
        height = input.nextDouble();
        // Convert the height into feet and inches
        feet = height / 30.48;
        inches = (height / 2.54);
        // Display the height in cm, feet and inches
        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}
