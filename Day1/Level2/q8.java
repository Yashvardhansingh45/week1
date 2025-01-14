import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object
            System.out.println("Enter the name of the person: ");
        String name = sc.nextLine(); // Read user input
            System.out.println("Enter the fromCity: ");
        String fromCity = sc.nextLine(); // Read user input
            System.out.println("Enter the viaCity: ");
        String viaCity = sc.nextLine(); // Read user input
            System.out.println("Enter the toCity: ");
        String toCity = sc.nextLine(); // Read user input
            System.out.println("Enter the distance from fromCity to viaCity: ");
        double distanceFromToVia = sc.nextDouble(); // Read user input
            System.out.println("Enter the time taken from fromCity to viaCity in minutes: ");
        int timeFromToVia = sc.nextInt(); // Read user input
            System.out.println("Enter the distance from viaCity to toCity: ");
        double distanceViaToFinalCity = sc.nextDouble(); // Read user input
            System.out.println("Enter the time taken from viaCity to toCity in minutes: ");
        int timeViaToFinalCity = sc.nextInt(); // Read user input
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
            System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");
        sc.close();
    }
}
