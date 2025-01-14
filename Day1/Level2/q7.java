import java.util.Scanner;
class q7 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // create a Scanner object
                    System.out.println("Enter the first number: ");
            int number1 = sc.nextInt(); // Read user input
                    System.out.println("Enter the second number: ");
            int number2 = sc.nextInt(); // Read user input
            // Swap the numbers using a temporary variable
            int temp = number1;
            number1 = number2;
            number2 = temp;
            // Display the swapped numbers
                System.out.println("The swapped numbers are " + number1 + " and " + number2);
            sc.close();
    }
}
