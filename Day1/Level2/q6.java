import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble(); // Read user input
        System.out.println("Enter the bonus: ");
        double bonus = sc.nextDouble(); // Read user input
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        sc.close();
    }
}
