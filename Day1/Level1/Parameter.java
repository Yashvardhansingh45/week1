package Level1;
import java.util.Scanner;
class Parameter {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take the perimeter of the square as input
            System.out.println("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        // Calculate the length of the side of the square
        double side = perimeter / 4;
        // Display the length of the side of the square
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
  }
}