package Level1;

import java.util.Scanner;
public class Checknumbers {
    public static void main(String []args){
        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        // create an array of 5 integers
        int arr[]=new int[5];
        // loop to take input from the user
            for (int i= 0; i<5 ;i++){
                System.out.println("Enter the number: ");
                arr[i]= sc.nextInt();
            }
        // loop to check if the number is positive, negative or zero
        for (int i= 0; i<5 ;i++){
            if (arr[i]>0){
                // check if the number is even or odd
                if (arr[i]%2==0){
                    System.out.println("The number "+arr[i]+" is positive and even");
                }
                else{
                    System.out.println("The number "+arr[i]+" is positive and odd");
                }
            
            }
            else if (arr[i]<0){
                System.out.println("The number "+arr[i]+" is negative");
            }
            else{
                System.out.println("The number "+arr[i]+" is zero");
            }
            // check if the first and last number are same, greater or smaller
            if (arr[0]==arr[4]){
                System.out.println("The first and last number are same");
            }
            else if(arr[0]>arr[4]){
                System.out.println("The first number is greater than the last number");
            }
            else{
                System.out.println("The first number is smaller than the last number");
            }
            sc.close();
        }
    }
}