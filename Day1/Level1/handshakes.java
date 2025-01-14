package Level1;
import java.util.Scanner;
public class handshakes {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Take the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        // Display the maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
        scanner.close();
    }
}