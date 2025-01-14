package Level1;
// import the Scanner class
import java.util.Scanner;
class CanVote{
    public static void main(String []args){
		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);
        // create an array of 10 integers
			int arr[]= new int[10];
        // loop to take input from the user
		for (int i= 0; i<10; i++){
			System.out.println("Enter the age of student: ");
			arr[i]= sc.nextInt();
		}
        // loop to check if the student can vote or not
		for (int i= 0; i<10; i++){
			if (arr[i]<0){
		System.out.println("The student with the age "+arr[i]+" is invalid age");	
			}
			else if (arr[i]>18){
		System.out.println("The student with the age "+arr[i]+" can vote");	
		}
			else {
		System.out.println("The student with the age "+arr[i]+" cannot vote");
        sc.close();
		}
	    }
	}	
}