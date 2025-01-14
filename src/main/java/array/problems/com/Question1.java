package array.problems.com;

import java.util.Scanner;

public class Question1 {

    public static void largestNumber(Scanner scan) {
        System.out.println("Enter the size of the array");
        //Initialize the size of the array
        int n = scan.nextInt();

        // Initialize the array
        int[] myList = new int[n];

        //For loop to accept the input array elements/values
        for (int i =0; i<n; i++){
            System.out.println("Enter the element of the array at index " + i);
            //Accepting the element of the array
            int inputList = scan.nextInt();
            // Assigning the element to the array
            myList[i]=inputList;
        }

        // Declare the variable and assign minimum value
        int maxValue = Integer.MIN_VALUE;

        // Looping to find the max value
        for(int i=0; i<n; i++){
            // Conditioning for filter the max value
            if(myList[i]>maxValue) {
                // Assign the max value to maxValue Variable
                maxValue = myList[i];
            }
        }

        // Printout the max value
        System.out.println("Maximum value is " + maxValue);

        System.out.println("Thank you for choosing Me 😀😀😀 !!!");
        System.out.println();
        System.out.println();
    }

}
