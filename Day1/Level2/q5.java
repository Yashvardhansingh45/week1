import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input for temperature in fahrenheit
        System.out.println("Enter the temperature in Fahrenheit: ");
        // Read user input
        double fahrenheit = sc.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5/9;
        // Print the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        sc.close();
    }
}
