import java.util.Scanner;
class q4 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input for temperature in celsius
        System.out.println("Enter the temperature in Celsius: ");
        // Read user input
        double celsius = sc.nextDouble();
        // Convert Celsius to Fahrenheit
        double farenheitResult = (celsius * 9/5) + 32;
        // Print the result
        System.out.println(celsius + " celsius is " + farenheitResult + " fahrenheit");
        sc.close();
}
}
