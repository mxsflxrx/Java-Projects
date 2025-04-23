import java.util.Scanner;
import java.lang.Math;

public class warmup {
    public static void main(String[] args){

        //input character
        System.out.print("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char text = input.nextLine().charAt(0);

        //detects if input is letter
        if (Character.isLetter(text)){
            System.out.println("The entered character is a letter.");

            //detects if input is uppercase
            if(Character.isUpperCase(text)){
                System.out.println("It is an uppercase letter.");

            //detects if input is lowercase
            }else if(Character.isLowerCase(text)){
                System.out.println("It is a lowercase letter.");
                System.out.println("The uppercase is: " + Character.toUpperCase(text));
            }
        
        //detects if input is digit
        }else if(Character.isDigit(text)){
            System.out.println("The entered character is a digit.");
            System.out.println("It's value when raised to the 10th power is: " + (int) Math.pow(text - 48, 10));

        //prints the input as symbol
        }else{
            System.out.println("The entered character is a symbol.");
        }

        input.close();
    }
}