package array.problems.com;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);

    {
        System.out.println("Welcome to Array Problems ");
        System.out.println("=================================================");
        System.out.println("=================================================");
        questionDisplay();
        System.out.println("Enter the question number");
    }

    public void questionDisplay(){
        System.out.println("Question1: Find largest number in the array");
        System.out.println("=================================================");
        System.out.println("Question2: Copy array");
        System.out.println("=================================================");
        System.out.println("Question3: Calculate the average value of array elements");
        System.out.println("=================================================");
        System.out.println("Question4: ");
        System.out.println("=================================================");
        System.out.println("=================================================");
    }

    public void questionSelect(){
        int questionNumber = scan.nextInt();
        switch (questionNumber){
            case 1:
                Question1.largestNumber(scan);
                break;
            default:
                System.out.println("Invalid question number");
        }

    }

    public boolean repeatQuestion(){
        System.out.println();
        System.out.println();
        System.out.println("Enter \'y\' for repeat question or \'n\' for exit");
        System.out.println();
        System.out.println();
        char isRepeatChar = scan.next().charAt(0);
        return isRepeatChar == 'y';
    }


}
