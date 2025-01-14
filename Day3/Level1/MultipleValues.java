package Level1;
import java.util.Scanner;
class MultipleValues {
    public static void main(String[] args) {

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            double number = sc.nextDouble();
            if (number <= 0 || index == 10) {
                break;
            }
            values[index] = number;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += values[i];
            System.out.println("Value " + (i + 1) + " = " + values[i]);
        }
        System.out.println("Total = " + total);
        sc.close();
    }
}
