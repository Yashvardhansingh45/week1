import java.util.Scanner; 
class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt(); // Read user input
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt(); // Read user input
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt(); // Read user input
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
        sc.close();
        }
    }
