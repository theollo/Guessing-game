
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        //Prompt a user to input their favourite chocolate
        System.out.println("What is the secret number between 1 and 10?");
        //Collect user input
        Scanner reader = new Scanner(System.in); //creates scanner object
        String guessingGame = reader.nextLine();

        if (guessingGame.equals("4")) {
            System.out.println("Correct!");
        } else if (guessingGame.equals("1")){
            System.out.println("Incorrect!");
        } else if (guessingGame.equals("2")){
            System.out.println("Close");
        } else if (guessingGame.equals("3")){
            System.out.println("Closer");
        } else if (guessingGame.equals("5")){
            System.out.println("Closer");
        } else if (guessingGame.equals("6")){
            System.out.println("Close");
        } else if (guessingGame.equals("7")){
            System.out.println("Incorrect!");
        } else if (guessingGame.equals("8")){
            System.out.println("Incorrect!");
        } else if (guessingGame.equals("9")){
            System.out.println("Incorrect!");
        } else if (guessingGame.equals("10")){
            System.out.println("Incorrect!");
        }
        //Ternary operator - this is a bit advanced for right now.
        //variable = (condition) ? expressionTrue : expressionFalse;
        //shorthand for if...else
        // String result = favouriteChocolate.equals("Bounty")? "Gross" :"Yum";
        // System.out.println(result);
    }
}
