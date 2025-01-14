package array.problems.com;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Menu {

    Scanner scan = new Scanner(System.in);
    Consumer<String> consume = System.out::println;
    Predicate<Character> isRepeatQuestion = c -> c == 'y';

    {
        consume.accept("Welcome to Array Problems ");
        consume.accept("=================================================");
        consume.accept("=================================================");
        questionDisplay();
        consume.accept("Enter the question number");
    }

    public void questionDisplay(){
        consume.accept("Question1: Find largest number in the array");
        consume.accept("=================================================");
        consume.accept("Question2: Copy array");
        consume.accept("=================================================");
        consume.accept("Question3: Calculate the average value of array elements");
        consume.accept("=================================================");
        consume.accept("Question4: ");
        consume.accept("=================================================");
        consume.accept("=================================================");
    }

    public void questionSelect(){
        int questionNumber = scan.nextInt();
        switch (questionNumber){
            case 1:
                Question1.largestNumber(scan);
                break;
            default:
                consume.accept("Invalid question number");
        }

    }

    public boolean repeatQuestion(){
        System.out.println();
        System.out.println();
        consume.accept("Enter \'y\' for repeat question or \'n\' for exit");
        System.out.println();
        System.out.println();
        return isRepeatQuestion.test(scan.next().charAt(0));
    }


}
