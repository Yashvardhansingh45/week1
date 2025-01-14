package Level1;
import java.util.Scanner;
class basicCalculator {
    public static void main(String[] args) {
        // declare the variables
        int number1, number2;
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Use Scanner Object to take user input
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        // Perform the basic arithmetic operations
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        // Display the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        input.close();
    }
}