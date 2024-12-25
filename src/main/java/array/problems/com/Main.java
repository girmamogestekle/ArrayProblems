package array.problems.com;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.questionSelect();
        boolean repeatQuestion = menu.repeatQuestion();
        while(repeatQuestion){
            System.out.println();
            System.out.println();
            menu.questionDisplay();
            System.out.println("Enter the question number");
            menu.questionSelect();
            repeatQuestion = menu.repeatQuestion();
        }
    }
}