package Level1;
import java.util.Scanner;
class ConvertDistance3 {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take the distance in feet as input
            System.out.println("Enter the distance in feet: ");
            int distanceInFeet = sc.nextInt();
        // Convert the distance into yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        // Display the result
            System.out.println("The distance in yards is " + distanceInYards + " and the distance in miles is " + distanceInMiles);
        sc.close();
    }
}