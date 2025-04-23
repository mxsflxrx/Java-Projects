import java.util.Scanner;

public class palindrome{
    public static void main(String args[]) {
        
        //Input 3-digit integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int threedig = input.nextInt();
        int copyThreedig = threedig;
        int revDig = 0;

        while(copyThreedig != 0) {
            int digit = copyThreedig % 10 ; //Gets the remainder
            copyThreedig /= 10 ;
            revDig = revDig * 10 + digit ;
        }

        //Display Result
        if (revDig == threedig) 
            //If revDig is the same as threeDig, then it's a palindrome number
            System.out.println(+ threedig + " is a palindrome");
        else
            System.out.println(+ threedig + " is not a palindrome");

        input.close();
    }
}