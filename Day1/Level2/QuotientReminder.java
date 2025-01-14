import java.util.Scanner;
class QuotientReminder {
    public static void main(String[] args) {
        // Create a variable number1, number2 and assign type as int as in int number1, number2;
        int number1, number2;
        // Create Scanner Object 
        Scanner input = new Scanner(System.in);
        // Use Scanner Object to take user input for number1 and number2
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        // calculate quotient and calculate reminder
        int quotient = number1 / number2;
        int reminder = number1 % number2;
        // Display the quotient and reminder for the given numbers
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two numbers " + number1 + " and " + number2);
        input.close();
    }
}