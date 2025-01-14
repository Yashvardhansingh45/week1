package Level1;
import java.util.Scanner;

class ConvertDistance2 {
    public static void main(String[] args) {
        // Create a variable km and assign type as double as in double km;
        double km;
        // Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        // Use Scanner Object to take user input for km as in km = input.nextInt();
        System.out.println("Enter the distance in kilometers: ");
        km = input.nextDouble();
        // Use 1 mile = 1.6 km formulae to calculate miles and show the output
        double mile = km / 1.6;
        // Display the total miles for the given km
        System.out.println("The total miles is " + mile + " miles for the given " + km + " km");
        input.close();
    }
}
