package Level1;
import java.util.Scanner;
public class MultiplicationTable {
        public static void main(String[] args) {
            // Write your code here
            int number;
            // Create a Scanner object
            Scanner sc =new Scanner(System.in);
            // Read a number form the user
            System.out.println("Enter the number to print the multiplication table: ");
            // Store the number in a variable
            number = sc.nextInt();
            // Create an array to store the result of the multiplication
            int result[]=new int[10];
            // Calculate the multiplication table
            for(int i=0;i<10;i++){
                result[i]=number*(i+1);
            }
            // Print the multiplication table
            for(int i=0;i<10;i++){
                System.out.println(number+" * "+(i+1)+" = "+result[i]);
            }
            sc.close();
        }
}
