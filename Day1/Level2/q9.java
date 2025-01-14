import java.util.Scanner; // import the Scanner class
class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter the first side: ");
        double side1 = sc.nextDouble(); // Read user input
        System.out.println("Enter the second side: ");
        double side2 = sc.nextDouble(); // Read user input
        System.out.println("Enter the third side: ");
        double side3 = sc.nextDouble(); // Read user input
        //         Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        //         Calculate the total number of rounds the athlete will run
        double rounds = 5000 / perimeter;
        //        Display the total number of rounds the athlete will run
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        sc.close();
    }   
}
