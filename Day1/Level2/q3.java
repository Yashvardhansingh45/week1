import java.util.Scanner;
class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble(); // read a value from the user
        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble(); // read b value from the user
        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble(); // read c value from the user
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
        sc.close();
    }
}