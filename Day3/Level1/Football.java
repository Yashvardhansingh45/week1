package Level1;
import java.util.Scanner;
public class Football {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        // double[] heights = {5.8, 5.9, 6.0, 5.7, 5.6, 5.5, 5.4, 5.3, 5.2, 5.1, 5.0};
        double[] heights = new double[11];
        // Get input values from the user
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        // Calculate the average height
        double mean = sum / 11;
        System.out.println(mean);
        sc.close();
    }
}
