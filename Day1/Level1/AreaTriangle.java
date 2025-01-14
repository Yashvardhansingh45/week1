package Level1;
import java.util.Scanner;
 class AreaTriangle {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take the base and height of the triangle as input
            System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();
            System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        // Calculate the area of the triangle
        double area = 0.5 * base * height;
        double areaInCm = area * 2.54 * 2.54;
        // Display the area of the triangle
            System.out.println("Area of the triangle in square centimeters is " + areaInCm + " Area of the triangle in square inches is " + area);
        sc.close();
    }
}