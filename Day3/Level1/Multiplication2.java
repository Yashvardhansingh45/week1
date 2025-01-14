package Level1;
import java.util.Scanner;
class Multiplication2 {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        int number = sc.nextInt();
        // Multiplying the number with 6, 7, 8, 9
        int[] multiplicationResult = new int[4];
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        // Printing the resultfb vdhnmjk lfhdgffhkvmdjgavn xwj
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
            sc.close();
        }
    }    
}
